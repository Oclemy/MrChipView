package com.devosha.mrchipview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.allyants.chipview.ChipView;
import com.allyants.chipview.SimpleChipAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ChipView mChipView;

    private void populateTags(){
        ArrayList tags = new ArrayList();
        tags.add("Database");
        tags.add("Data Binding");
        tags.add("Widgets");
        tags.add("RecyclerView");
        tags.add("Activity");
        tags.add("Services");
        tags.add("Networking");
        SimpleChipAdapter adapter = new SimpleChipAdapter(tags);
        mChipView.setAdapter(adapter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mChipView = findViewById(R.id.mChipView);
        this.populateTags();
    }

}

//end