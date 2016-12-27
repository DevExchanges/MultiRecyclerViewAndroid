package info.devexchanges.multiplerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private String[] asiaCountries = {"Vietnam", "China", "Japan", "Korea", "India", "Singapore", "Thailand", "Malaysia"};
    private String[] europeCountries = {"France", "Germany", "Sweden", "Denmark", "England", "Spain", "Portugal", "Norway"};

    private RecyclerView firstRecyclerView;
    private RecyclerView secondRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstRecyclerView = (RecyclerView)findViewById(R.id.recycler);
        secondRecyclerView = (RecyclerView)findViewById(R.id.recycler_1);

        RecyclerView.LayoutManager firstLayoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager secondLayoutManager = new LinearLayoutManager(this);
        firstRecyclerView.setLayoutManager(firstLayoutManager);
        secondRecyclerView.setLayoutManager(secondLayoutManager);
    }
}
