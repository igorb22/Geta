package Services;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.geta.R;

public class LineHolder extends RecyclerView.ViewHolder{
    public TextView task_description;
    public TextView task_date;
    public TextView task_hour;
    public ImageView task_realized;


    public LineHolder(View itemView) {
        super(itemView);

        task_description = itemView.findViewById(R.id.task_name);
        task_date = itemView.findViewById(R.id.task_date);
        task_hour = itemView.findViewById(R.id.task_hour);
        task_realized = itemView.findViewById(R.id.task_realized);
    }
}
