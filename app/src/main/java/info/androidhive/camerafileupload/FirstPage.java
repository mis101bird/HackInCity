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


public class FirstPage extends Fragment {

    private ListView listView;
    ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
    private SimpleAdapter adapter;

    public FirstPage() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        adapter = new SimpleAdapter(
                getActivity(),
                list,
                R.layout.first_layout,
                new String[] { "title","detail"},
                new int[] { R.id.textView1, R.id.textView2 } );

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        View view =inflater.inflate(R.layout.fragment_first_page, container, false);
        listView = (ListView)view.findViewById(R.id.listView1);

           /*example*/
        HashMap<String, String> item = new HashMap<String, String>(); //裝每個ListView item的data
        item.put("title", "魯小蛇");
        item.put("detail","X1");

        list.add(item);

        HashMap<String, String> item1 = new HashMap<String, String>();
        item1.put("title", "皮卡丘");
        item1.put("detail","X3");

        list.add(item1);



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
