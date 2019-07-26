package Services;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.geta.R;

import java.util.ArrayList;
import java.util.List;

import Model.Task;

public class TaskAdapter extends RecyclerView.Adapter<LineHolder> {

    private final List<Task> tasks;

    public TaskAdapter(ArrayList tasks) {
        this.tasks = tasks;
    }

    @Override
    public LineHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new LineHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.main_line_view, parent, false));
    }

    @Override
    public void onBindViewHolder(LineHolder holder, int position) {
        holder.task_description.setText(tasks.get(position).getDescricao());
        holder.task_date.setText(tasks.get(position).getData().toString());
        holder.task_hour.setText(tasks.get(position).getHora().toString());
        // setar imagens aqui

    }

    @Override
    public int getItemCount() {
        return tasks != null ? tasks.size() : 0;
    }

}