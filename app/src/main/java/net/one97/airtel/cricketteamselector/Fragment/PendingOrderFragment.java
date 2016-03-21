package net.one97.airtel.cricketteamselector.Fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import net.one97.airtel.cricketteamselector.Adapter.ListViewAdapter;
import net.one97.airtel.cricketteamselector.Adapter.OrderAdapter;
import net.one97.airtel.cricketteamselector.Adapter.OrderItemAdapter;
import net.one97.airtel.cricketteamselector.R;
import net.one97.airtel.cricketteamselector.pojo.OrderItem;

import java.util.ArrayList;

/**
 * Created by sandeep2.kumar on 22-02-2016.
 */
public class PendingOrderFragment extends Fragment {
    private View view;
    private ListView mListView;
    private OrderAdapter mAdapter;
    private Context mContext;
    private ArrayList<OrderItem> orderItemList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        if (view == null) {
            view = inflater.inflate(R.layout.fragment_pending_order, container, false);
        } else {
            ViewGroup parent = (ViewGroup) view.getParent();
            parent.removeView(view);
        }

        //mContext = getActivity().getApplicationContext();
        //mListView = (ListView) v.findViewById(R.id.home_list_view);

        orderItemList = orders();
        OrderItemAdapter adapter = new OrderItemAdapter(getActivity(), R.layout.fragment_order_list_item, orderItemList);
        mListView = (ListView) view.findViewById(R.id.pending_listview);
        mListView.setAdapter(adapter);
        return view;
    }

    @SuppressLint("NewApi")
    public ArrayList<OrderItem> orders()
    {
        ArrayList<OrderItem> orderItemList =new ArrayList<OrderItem>();
        OrderItem order = new OrderItem();
        orderItemList.add(order);
        OrderItem order1 = new OrderItem();
        orderItemList.add(order1);
        OrderItem order2 = new OrderItem();
        orderItemList.add(order2);
        OrderItem order3 = new OrderItem();
        orderItemList.add(order3);
        return orderItemList;
    }

}
