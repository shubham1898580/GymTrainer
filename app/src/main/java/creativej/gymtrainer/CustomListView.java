package creativej.gymtrainer;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jaini on 8/4/2017.
 */

public class CustomListView extends ArrayAdapter<String> {
    private String[] titel;
    private String[] discription;
    private int[] imgid;
private Activity context;

    public CustomListView( Activity context,String[] titel,int[] imgid) {
        super(context, R.layout.listview_layout,titel);
        this.context=context;
        this.titel=titel;
        this.imgid=imgid;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View r=convertView;
        ViewHolder viewHolder=null;
        if (r==null){

            LayoutInflater layoutInflater=context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.listview_layout,null,true);
            viewHolder=new ViewHolder(r);
            r.setTag(viewHolder);
        }else {

            viewHolder= (ViewHolder) r.getTag();
        }
viewHolder.ivw.setImageResource(imgid[position]);
        viewHolder.tvw1.setText(titel[position]);

        return r;
    }

    class ViewHolder{
       TextView tvw1;
        ImageView ivw;
        ViewHolder(View v){
            tvw1= (TextView) v.findViewById(R.id.textView3);
            ivw= (ImageView) v.findViewById(R.id.imageView2);
        }



    }

}
