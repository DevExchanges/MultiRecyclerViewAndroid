package info.devexchanges.multiplerecyclerview;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private Activity activity;
    private String[] strings;

    public RecyclerViewAdapter(Activity activity, String[] strings) {
        this.activity = activity;
        this.strings = strings;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.item_recycler_view, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        viewHolder.textView.setText(strings[position]);
    }

    @Override
    public int getItemCount() {
        return strings.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        public ViewHolder(View view) {
            super(view);
            textView = (TextView) view.findViewById(R.id.text);
        }
    }
}