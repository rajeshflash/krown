package net.one97.airtel.cricketteamselector.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import net.one97.airtel.cricketteamselector.R;
import net.one97.airtel.cricketteamselector.pojo.OrderItem;

import java.util.ArrayList;

/**
 * Created by sandeep2.kumar on 23-02-2016.
 */
public class OrderItemAdapter extends ArrayAdapter<OrderItem> {
    private ArrayList<OrderItem> orderItemsList;
    private Context context;
    private int resource;
    private View view;
    private Holder holder;
    private OrderItem orderItem;

    public OrderItemAdapter(Context context, int resource, ArrayList<OrderItem> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.orderItemsList = objects;
    }

    @Override
    public long getItemId(int arg0) {
        return arg0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(resource, parent, false);

        holder = new Holder();
        //holder.clinicImage=(ImageView)view.findViewById(R.id.clinic_image);
        holder.clinicName=(TextView)view.findViewById(R.id.patient_lab_name_textview);
        holder.orderStatus= (TextView)view.findViewById(R.id.order_status);
        holder.orderDate= (TextView)view.findViewById(R.id.order_date_time_textview);
        holder.patientName= (TextView)view.findViewById(R.id.order_patient_name);
        holder.teeth= (TextView)view.findViewById(R.id.order_patient_teeth_name);
        holder.crown= (TextView)view.findViewById(R.id.order_patient_crown_name);
        holder.warranty= (TextView)view.findViewById(R.id.order_patient_warranty_name);
        holder.paymentDue= (TextView)view.findViewById(R.id.order_patient_payment_name);
        holder.warrantyStatus= (TextView)view.findViewById(R.id.order_warranty_status_label);
        holder.paymentNow= (TextView)view.findViewById(R.id.order_patient_payduenow_name);
        orderItem = orderItemsList.get(position);
        return view;
    }

    public class Holder {
        ImageView clinicImage;
        TextView clinicName;
        TextView orderStatus;
        TextView orderDate;
        TextView patientName;
        TextView teeth;
        TextView crown;
        TextView warranty;
        TextView paymentDue;
        TextView warrantyStatus;
        TextView paymentNow;
    }
}
