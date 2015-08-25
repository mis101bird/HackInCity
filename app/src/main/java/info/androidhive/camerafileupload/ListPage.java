package info.androidhive.camerafileupload;


import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;


public class ListPage extends Fragment {

    private ListView listView;
    ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
    private SimpleAdapter adapter;

    public ListPage() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        adapter = new SimpleAdapter(
                getActivity(),
                list,
                R.layout.list_layout,
                new String[] { "title","detail"},
                new int[] { R.id.textView7, R.id.textView6 } );



    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        View view =inflater.inflate(R.layout.fragment_list_page, container, false);
        listView = (ListView)view.findViewById(R.id.listView);
           /*example*/
        HashMap<String, String> item = new HashMap<String, String>(); //裝每個ListView item的data
        item.put("title", "任務一");
        item.put("detail","打醬油");
        list.add(item);

        HashMap<String, String> item1 = new HashMap<String, String>();
        item1.put("title", "任務二");
        item1.put("detail","洗洗睡");
        list.add(item1);

        HashMap<String, String> item2 = new HashMap<String, String>();
        item2.put("title", "任務三");
        item2.put("detail", "當魯蛇");
        list.add(item2);

        listView.setAdapter(adapter); //將數據轉成ListView能接受的Item格式並inflate完成
        return view;

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}
