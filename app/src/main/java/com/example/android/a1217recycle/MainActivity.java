package com.example.android.a1217recycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.a1217recycle.Adapter.CustomAdapter;
import com.example.android.a1217recycle.Listener.OnProfileClickListener;
import com.example.android.a1217recycle.Model.ProfileData;
import com.example.android.a1217recycle.Model.ProfileModel;
import com.google.gson.Gson;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.recycler)
    RecyclerView recyclerView;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        adapter = new CustomAdapter();
        adapter.setListener(new OnProfileClickListener() {
            @Override
            public void onClick(ProfileModel model) {
                Intent intent  = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("MODEL_EXTRA", model);
                startActivity(intent);

            }
        });
        adapter.setItems(getList());

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


    }

    public ArrayList<ProfileModel> getList() {
        String imagesJson = "{\n" +
                "    \"totalHits\":500,\n" +
                "    \"hits\":[\n" +
                "        {\n" +
                "            \"previewHeight\":99,\n" +
                "            \"likes\":33,\n" +
                "            \"favorites\":11,\n" +
                "            \"tags\":\"lantern, christmas time, advent\",\n" +
                "            \"webformatHeight\":426,\n" +
                "            \"views\":558,\n" +
                "            \"webformatWidth\":640,\n" +
                "            \"previewWidth\":150,\n" +
                "            \"comments\":18,\n" +
                "            \"downloads\":221,\n" +
                "            \"pageURL\":\"https://pixabay.com/en/lantern-christmas-time-advent-3012749/\",\n" +
                "            \"previewURL\":\"https://cdn.pixabay.com/photo/2017/12/11/17/15/lantern-3012749_150.jpg\",\n" +
                "            \"webformatURL\":\"https://pixabay.com/get/ea35b00d2ff0083ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg\",\n" +
                "            \"imageWidth\":6000,\n" +
                "            \"user_id\":1564471,\n" +
                "            \"user\":\"annca\",\n" +
                "            \"type\":\"photo\",\n" +
                "            \"id\":3012749,\n" +
                "            \"userImageURL\":\"https://cdn.pixabay.com/user/2015/11/27/06-58-54-609_250x250.jpg\",\n" +
                "            \"imageHeight\":4000\n" +
                "        },\n" +
                "        {\n" +
                "            \"previewHeight\":104,\n" +
                "            \"likes\":31,\n" +
                "            \"favorites\":14,\n" +
                "            \"tags\":\"christmas, winter, snow\",\n" +
                "            \"webformatHeight\":447,\n" +
                "            \"views\":965,\n" +
                "            \"webformatWidth\":640,\n" +
                "            \"previewWidth\":150,\n" +
                "            \"comments\":7,\n" +
                "            \"downloads\":452,\n" +
                "            \"pageURL\":\"https://pixabay.com/en/christmas-winter-snow-white-horse-3010129/\",\n" +
                "            \"previewURL\":\"https://cdn.pixabay.com/photo/2017/12/10/15/16/christmas-3010129_150.jpg\",\n" +
                "            \"webformatURL\":\"https://pixabay.com/get/ea35b00f29f6083ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg\",\n" +
                "            \"imageWidth\":5000,\n" +
                "            \"user_id\":6300591,\n" +
                "            \"user\":\"kudybadorota\",\n" +
                "            \"type\":\"photo\",\n" +
                "            \"id\":3010129,\n" +
                "            \"userImageURL\":\"https://cdn.pixabay.com/user/2017/12/10/18-43-02-894_250x250.jpg\",\n" +
                "            \"imageHeight\":3498\n" +
                "        },\n" +
                "        {\n" +
                "            \"previewHeight\":99,\n" +
                "            \"likes\":24,\n" +
                "            \"favorites\":7,\n" +
                "            \"tags\":\"nicholas shoe, christmas time, advent\",\n" +
                "            \"webformatHeight\":426,\n" +
                "            \"views\":394,\n" +
                "            \"webformatWidth\":640,\n" +
                "            \"previewWidth\":150,\n" +
                "            \"comments\":16,\n" +
                "            \"downloads\":175,\n" +
                "            \"pageURL\":\"https://pixabay.com/en/nicholas-shoe-christmas-time-advent-3012801/\",\n" +
                "            \"previewURL\":\"https://cdn.pixabay.com/photo/2017/12/11/17/46/nicholas-shoe-3012801_150.jpg\",\n" +
                "            \"webformatURL\":\"https://pixabay.com/get/ea35b00d20f4003ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg\",\n" +
                "            \"imageWidth\":6000,\n" +
                "            \"user_id\":1564471,\n" +
                "            \"user\":\"annca\",\n" +
                "            \"type\":\"photo\",\n" +
                "            \"id\":3012801,\n" +
                "            \"userImageURL\":\"https://cdn.pixabay.com/user/2015/11/27/06-58-54-609_250x250.jpg\",\n" +
                "            \"imageHeight\":4000\n" +
                "        },\n" +
                "        {\n" +
                "            \"previewHeight\":89,\n" +
                "            \"likes\":21,\n" +
                "            \"favorites\":8,\n" +
                "            \"tags\":\"seeds, flying seeds, close\",\n" +
                "            \"webformatHeight\":381,\n" +
                "            \"views\":249,\n" +
                "            \"webformatWidth\":640,\n" +
                "            \"previewWidth\":150,\n" +
                "            \"comments\":20,\n" +
                "            \"downloads\":111,\n" +
                "            \"pageURL\":\"https://pixabay.com/en/seeds-flying-seeds-close-winter-3013260/\",\n" +
                "            \"previewURL\":\"https://cdn.pixabay.com/photo/2017/12/11/21/04/seeds-3013260_150.jpg\",\n" +
                "            \"webformatURL\":\"https://pixabay.com/get/ea35b00c2af2013ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg\",\n" +
                "            \"imageWidth\":6000,\n" +
                "            \"user_id\":1834854,\n" +
                "            \"user\":\"ulleo\",\n" +
                "            \"type\":\"photo\",\n" +
                "            \"id\":3013260,\n" +
                "            \"userImageURL\":\"https://cdn.pixabay.com/user/2017/07/05/00-16-31-688_250x250.jpg\",\n" +
                "            \"imageHeight\":3576\n" +
                "        },\n" +
                "        {\n" +
                "            \"previewHeight\":100,\n" +
                "            \"likes\":26,\n" +
                "            \"favorites\":12,\n" +
                "            \"tags\":\"christmas, ball, bauble\",\n" +
                "            \"webformatHeight\":428,\n" +
                "            \"views\":1449,\n" +
                "            \"webformatWidth\":640,\n" +
                "            \"previewWidth\":150,\n" +
                "            \"comments\":5,\n" +
                "            \"downloads\":688,\n" +
                "            \"pageURL\":\"https://pixabay.com/en/christmas-ball-bauble-decoration-3012862/\",\n" +
                "            \"previewURL\":\"https://cdn.pixabay.com/photo/2017/12/11/18/13/christmas-3012862_150.jpg\",\n" +
                "            \"webformatURL\":\"https://pixabay.com/get/ea35b00d20f2033ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg\",\n" +
                "            \"imageWidth\":3228,\n" +
                "            \"user_id\":1499084,\n" +
                "            \"user\":\"monicore\",\n" +
                "            \"type\":\"photo\",\n" +
                "            \"id\":3012862,\n" +
                "            \"userImageURL\":\"https://cdn.pixabay.com/user/2015/10/09/15-11-20-730_250x250.jpg\",\n" +
                "            \"imageHeight\":2163\n" +
                "        },\n" +
                "        {\n" +
                "            \"previewHeight\":95,\n" +
                "            \"likes\":24,\n" +
                "            \"favorites\":6,\n" +
                "            \"tags\":\"lion, roar, africa\",\n" +
                "            \"webformatHeight\":407,\n" +
                "            \"views\":889,\n" +
                "            \"webformatWidth\":640,\n" +
                "            \"previewWidth\":150,\n" +
                "            \"comments\":13,\n" +
                "            \"downloads\":329,\n" +
                "            \"pageURL\":\"https://pixabay.com/en/lion-roar-africa-animal-wildcat-3012515/\",\n" +
                "            \"previewURL\":\"https://cdn.pixabay.com/photo/2017/12/11/15/34/lion-3012515_150.jpg\",\n" +
                "            \"webformatURL\":\"https://pixabay.com/get/ea35b00d2df5043ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg\",\n" +
                "            \"imageWidth\":3306,\n" +
                "            \"user_id\":1546275,\n" +
                "            \"user\":\"5arah\",\n" +
                "            \"type\":\"photo\",\n" +
                "            \"id\":3012515,\n" +
                "            \"userImageURL\":\"https://cdn.pixabay.com/user/2016/04/25/20-19-38-614_250x250.jpg\",\n" +
                "            \"imageHeight\":2103\n" +
                "        },\n" +
                "        {\n" +
                "            \"previewHeight\":99,\n" +
                "            \"likes\":21,\n" +
                "            \"favorites\":8,\n" +
                "            \"tags\":\"animal, bird, robin\",\n" +
                "            \"webformatHeight\":426,\n" +
                "            \"views\":211,\n" +
                "            \"webformatWidth\":640,\n" +
                "            \"previewWidth\":150,\n" +
                "            \"comments\":11,\n" +
                "            \"downloads\":100,\n" +
                "            \"pageURL\":\"https://pixabay.com/en/animal-bird-robin-3013563/\",\n" +
                "            \"previewURL\":\"https://cdn.pixabay.com/photo/2017/12/11/23/29/animal-3013563_150.jpg\",\n" +
                "            \"webformatURL\":\"https://pixabay.com/get/ea35b00c2df2023ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg\",\n" +
                "            \"imageWidth\":2748,\n" +
                "            \"user_id\":740865,\n" +
                "            \"user\":\"Oldiefan\",\n" +
                "            \"type\":\"photo\",\n" +
                "            \"id\":3013563,\n" +
                "            \"userImageURL\":\"https://cdn.pixabay.com/user/2016/06/08/21-49-55-294_250x250.jpg\",\n" +
                "            \"imageHeight\":1832\n" +
                "        },\n" +
                "        {\n" +
                "            \"previewHeight\":99,\n" +
                "            \"likes\":114,\n" +
                "            \"favorites\":94,\n" +
                "            \"tags\":\"decorating christmas tree, santa woman, mrs\",\n" +
                "            \"webformatHeight\":426,\n" +
                "            \"views\":23705,\n" +
                "            \"webformatWidth\":640,\n" +
                "            \"previewWidth\":150,\n" +
                "            \"comments\":21,\n" +
                "            \"downloads\":10149,\n" +
                "            \"pageURL\":\"https://pixabay.com/en/decorating-christmas-tree-santa-woman-2999722/\",\n" +
                "            \"previewURL\":\"https://cdn.pixabay.com/photo/2017/12/05/16/39/decorating-christmas-tree-2999722_150.jpg\",\n" +
                "            \"webformatURL\":\"https://pixabay.com/get/eb3cb8062ff6033ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg\",\n" +
                "            \"imageWidth\":5760,\n" +
                "            \"user_id\":334088,\n" +
                "            \"user\":\"jill111\",\n" +
                "            \"type\":\"photo\",\n" +
                "            \"id\":2999722,\n" +
                "            \"userImageURL\":\"https://cdn.pixabay.com/user/2017/12/10/14-54-44-673_250x250.jpg\",\n" +
                "            \"imageHeight\":3840\n" +
                "        },\n" +
                "        {\n" +
                "            \"previewHeight\":107,\n" +
                "            \"likes\":22,\n" +
                "            \"favorites\":9,\n" +
                "            \"tags\":\"spring, ease, slightly\",\n" +
                "            \"webformatHeight\":457,\n" +
                "            \"views\":354,\n" +
                "            \"webformatWidth\":640,\n" +
                "            \"previewWidth\":150,\n" +
                "            \"comments\":9,\n" +
                "            \"downloads\":213,\n" +
                "            \"pageURL\":\"https://pixabay.com/en/spring-ease-slightly-blue-airy-3010848/\",\n" +
                "            \"previewURL\":\"https://cdn.pixabay.com/photo/2017/12/10/20/56/spring-3010848_150.jpg\",\n" +
                "            \"webformatURL\":\"https://pixabay.com/get/ea35b00f20f0093ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg\",\n" +
                "            \"imageWidth\":2051,\n" +
                "            \"user_id\":443272,\n" +
                "            \"user\":\"Sponchia\",\n" +
                "            \"type\":\"photo\",\n" +
                "            \"id\":3010848,\n" +
                "            \"userImageURL\":\"https://cdn.pixabay.com/user/2017/10/12/20-30-21-88_250x250.jpg\",\n" +
                "            \"imageHeight\":1465\n" +
                "        },\n" +
                "        {\n" +
                "            \"previewHeight\":99,\n" +
                "            \"likes\":22,\n" +
                "            \"favorites\":4,\n" +
                "            \"tags\":\"christmas gift, made, gift\",\n" +
                "            \"webformatHeight\":426,\n" +
                "            \"views\":429,\n" +
                "            \"webformatWidth\":640,\n" +
                "            \"previewWidth\":150,\n" +
                "            \"comments\":13,\n" +
                "            \"downloads\":179,\n" +
                "            \"pageURL\":\"https://pixabay.com/en/christmas-gift-made-gift-surprise-3012821/\",\n" +
                "            \"previewURL\":\"https://cdn.pixabay.com/photo/2017/12/11/17/56/christmas-gift-3012821_150.jpg\",\n" +
                "            \"webformatURL\":\"https://pixabay.com/get/ea35b00d20f6003ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg\",\n" +
                "            \"imageWidth\":6000,\n" +
                "            \"user_id\":1564471,\n" +
                "            \"user\":\"annca\",\n" +
                "            \"type\":\"photo\",\n" +
                "            \"id\":3012821,\n" +
                "            \"userImageURL\":\"https://cdn.pixabay.com/user/2015/11/27/06-58-54-609_250x250.jpg\",\n" +
                "            \"imageHeight\":4000\n" +
                "        },\n" +
                "        {\n" +
                "            \"previewHeight\":99,\n" +
                "            \"likes\":43,\n" +
                "            \"favorites\":18,\n" +
                "            \"tags\":\"book, gold, bible\",\n" +
                "            \"webformatHeight\":426,\n" +
                "            \"views\":2178,\n" +
                "            \"webformatWidth\":640,\n" +
                "            \"previewWidth\":150,\n" +
                "            \"comments\":29,\n" +
                "            \"downloads\":1495,\n" +
                "            \"pageURL\":\"https://pixabay.com/en/book-gold-bible-education-read-3005680/\",\n" +
                "            \"previewURL\":\"https://cdn.pixabay.com/photo/2017/12/08/12/04/book-3005680_150.jpg\",\n" +
                "            \"webformatURL\":\"https://pixabay.com/get/ea35b10a2efc013ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg\",\n" +
                "            \"imageWidth\":5184,\n" +
                "            \"user_id\":5598375,\n" +
                "            \"user\":\"holiho\",\n" +
                "            \"type\":\"photo\",\n" +
                "            \"id\":3005680,\n" +
                "            \"userImageURL\":\"https://cdn.pixabay.com/user/2017/12/05/09-49-52-151_250x250.jpg\",\n" +
                "            \"imageHeight\":3456\n" +
                "        },\n" +
                "        {\n" +
                "            \"previewHeight\":75,\n" +
                "            \"likes\":142,\n" +
                "            \"favorites\":99,\n" +
                "            \"tags\":\"fantasy, landscape, elephant\",\n" +
                "            \"webformatHeight\":320,\n" +
                "            \"views\":30756,\n" +
                "            \"webformatWidth\":640,\n" +
                "            \"previewWidth\":150,\n" +
                "            \"comments\":39,\n" +
                "            \"downloads\":16736,\n" +
                "            \"pageURL\":\"https://pixabay.com/en/fantasy-landscape-elephant-man-sun-2995326/\",\n" +
                "            \"previewURL\":\"https://cdn.pixabay.com/photo/2017/12/03/17/23/fantasy-2995326_150.jpg\",\n" +
                "            \"webformatURL\":\"https://pixabay.com/get/eb3cb80a2bf6073ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg\",\n" +
                "            \"imageWidth\":6000,\n" +
                "            \"user_id\":4893063,\n" +
                "            \"user\":\"kellepics\",\n" +
                "            \"type\":\"photo\",\n" +
                "            \"id\":2995326,\n" +
                "            \"userImageURL\":\"https://cdn.pixabay.com/user/2017/03/22/17-10-58-240_250x250.jpg\",\n" +
                "            \"imageHeight\":3000\n" +
                "        },\n" +
                "        {\n" +
                "            \"previewHeight\":99,\n" +
                "            \"likes\":26,\n" +
                "            \"favorites\":4,\n" +
                "            \"tags\":\"christmas, winter, tree\",\n" +
                "            \"webformatHeight\":426,\n" +
                "            \"views\":1317,\n" +
                "            \"webformatWidth\":640,\n" +
                "            \"previewWidth\":150,\n" +
                "            \"comments\":11,\n" +
                "            \"downloads\":577,\n" +
                "            \"pageURL\":\"https://pixabay.com/en/christmas-winter-tree-snow-balls-3009720/\",\n" +
                "            \"previewURL\":\"https://cdn.pixabay.com/photo/2017/12/10/11/58/christmas-3009720_150.jpg\",\n" +
                "            \"webformatURL\":\"https://pixabay.com/get/ea35b1062ff6013ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg\",\n" +
                "            \"imageWidth\":5184,\n" +
                "            \"user_id\":5598375,\n" +
                "            \"user\":\"holiho\",\n" +
                "            \"type\":\"photo\",\n" +
                "            \"id\":3009720,\n" +
                "            \"userImageURL\":\"https://cdn.pixabay.com/user/2017/12/05/09-49-52-151_250x250.jpg\",\n" +
                "            \"imageHeight\":3456\n" +
                "        },\n" +
                "        {\n" +
                "            \"previewHeight\":99,\n" +
                "            \"likes\":20,\n" +
                "            \"favorites\":4,\n" +
                "            \"tags\":\"nicholas boots, boots, st nicholas day\",\n" +
                "            \"webformatHeight\":426,\n" +
                "            \"views\":164,\n" +
                "            \"webformatWidth\":640,\n" +
                "            \"previewWidth\":150,\n" +
                "            \"comments\":10,\n" +
                "            \"downloads\":98,\n" +
                "            \"pageURL\":\"https://pixabay.com/en/nicholas-boots-boots-st-nicholas-day-3009717/\",\n" +
                "            \"previewURL\":\"https://cdn.pixabay.com/photo/2017/12/10/11/57/nicholas-boots-3009717_150.jpg\",\n" +
                "            \"webformatURL\":\"https://pixabay.com/get/ea35b1062ff5063ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg\",\n" +
                "            \"imageWidth\":7300,\n" +
                "            \"user_id\":1627417,\n" +
                "            \"user\":\"Myriams-Fotos\",\n" +
                "            \"type\":\"photo\",\n" +
                "            \"id\":3009717,\n" +
                "            \"userImageURL\":\"https://cdn.pixabay.com/user/2016/11/08/18-24-35-609_250x250.jpg\",\n" +
                "            \"imageHeight\":4866\n" +
                "        },\n" +
                "        {\n" +
                "            \"previewHeight\":89,\n" +
                "            \"likes\":235,\n" +
                "            \"favorites\":198,\n" +
                "            \"tags\":\"cinnamon stars, cinnamon sticks, pine cones\",\n" +
                "            \"webformatHeight\":381,\n" +
                "            \"views\":41867,\n" +
                "            \"webformatWidth\":640,\n" +
                "            \"previewWidth\":150,\n" +
                "            \"comments\":47,\n" +
                "            \"downloads\":19883,\n" +
                "            \"pageURL\":\"https://pixabay.com/en/cinnamon-stars-cinnamon-sticks-2991174/\",\n" +
                "            \"previewURL\":\"https://cdn.pixabay.com/photo/2017/12/01/16/14/cinnamon-stars-2991174_150.jpg\",\n" +
                "            \"webformatURL\":\"https://pixabay.com/get/eb3cb80e29f3053ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg\",\n" +
                "            \"imageWidth\":6000,\n" +
                "            \"user_id\":509903,\n" +
                "            \"user\":\"congerdesign\",\n" +
                "            \"type\":\"photo\",\n" +
                "            \"id\":2991174,\n" +
                "            \"userImageURL\":\"https://cdn.pixabay.com/user/2017/10/20/10-15-52-97_250x250.jpg\",\n" +
                "            \"imageHeight\":3581\n" +
                "        },\n" +
                "        {\n" +
                "            \"previewHeight\":84,\n" +
                "            \"likes\":31,\n" +
                "            \"favorites\":16,\n" +
                "            \"tags\":\"snow man, snow, winter\",\n" +
                "            \"webformatHeight\":360,\n" +
                "            \"views\":4380,\n" +
                "            \"webformatWidth\":640,\n" +
                "            \"previewWidth\":150,\n" +
                "            \"comments\":29,\n" +
                "            \"downloads\":3214,\n" +
                "            \"pageURL\":\"https://pixabay.com/en/snow-man-snow-winter-cold-wintry-3008179/\",\n" +
                "            \"previewURL\":\"https://cdn.pixabay.com/photo/2017/12/09/16/41/snow-man-3008179_150.jpg\",\n" +
                "            \"webformatURL\":\"https://pixabay.com/get/ea35b10729f3083ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg\",\n" +
                "            \"imageWidth\":5968,\n" +
                "            \"user_id\":165106,\n" +
                "            \"user\":\"suju\",\n" +
                "            \"type\":\"photo\",\n" +
                "            \"id\":3008179,\n" +
                "            \"userImageURL\":\"https://cdn.pixabay.com/user/2017/12/11/19-22-40-109_250x250.jpeg\",\n" +
                "            \"imageHeight\":3358\n" +
                "        },\n" +
                "        {\n" +
                "            \"previewHeight\":83,\n" +
                "            \"likes\":22,\n" +
                "            \"favorites\":10,\n" +
                "            \"tags\":\"background, christmas, christmas background\",\n" +
                "            \"webformatHeight\":357,\n" +
                "            \"views\":1520,\n" +
                "            \"webformatWidth\":640,\n" +
                "            \"previewWidth\":150,\n" +
                "            \"comments\":1,\n" +
                "            \"downloads\":919,\n" +
                "            \"pageURL\":\"https://pixabay.com/en/background-christmas-3009949/\",\n" +
                "            \"previewURL\":\"https://cdn.pixabay.com/photo/2017/12/10/13/37/background-3009949_150.jpg\",\n" +
                "            \"webformatURL\":\"https://pixabay.com/get/ea35b10621f0083ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg\",\n" +
                "            \"imageWidth\":7020,\n" +
                "            \"user_id\":1499084,\n" +
                "            \"user\":\"monicore\",\n" +
                "            \"type\":\"photo\",\n" +
                "            \"id\":3009949,\n" +
                "            \"userImageURL\":\"https://cdn.pixabay.com/user/2015/10/09/15-11-20-730_250x250.jpg\",\n" +
                "            \"imageHeight\":3917\n" +
                "        },\n" +
                "        {\n" +
                "            \"previewHeight\":150,\n" +
                "            \"likes\":17,\n" +
                "            \"favorites\":5,\n" +
                "            \"tags\":\"animal, bird, tit\",\n" +
                "            \"webformatHeight\":640,\n" +
                "            \"views\":157,\n" +
                "            \"webformatWidth\":640,\n" +
                "            \"previewWidth\":150,\n" +
                "            \"comments\":10,\n" +
                "            \"downloads\":70,\n" +
                "            \"pageURL\":\"https://pixabay.com/en/animal-bird-tit-blue-tit-3013557/\",\n" +
                "            \"previewURL\":\"https://cdn.pixabay.com/photo/2017/12/11/23/25/animal-3013557_150.jpg\",\n" +
                "            \"webformatURL\":\"https://pixabay.com/get/ea35b00c2df1063ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg\",\n" +
                "            \"imageWidth\":2074,\n" +
                "            \"user_id\":740865,\n" +
                "            \"user\":\"Oldiefan\",\n" +
                "            \"type\":\"photo\",\n" +
                "            \"id\":3013557,\n" +
                "            \"userImageURL\":\"https://cdn.pixabay.com/user/2016/06/08/21-49-55-294_250x250.jpg\",\n" +
                "            \"imageHeight\":2074\n" +
                "        },\n" +
                "        {\n" +
                "            \"previewHeight\":100,\n" +
                "            \"likes\":16,\n" +
                "            \"favorites\":8,\n" +
                "            \"tags\":\"piza, food, cheese\",\n" +
                "            \"webformatHeight\":427,\n" +
                "            \"views\":1383,\n" +
                "            \"webformatWidth\":640,\n" +
                "            \"previewWidth\":150,\n" +
                "            \"comments\":8,\n" +
                "            \"downloads\":580,\n" +
                "            \"pageURL\":\"https://pixabay.com/en/piza-food-cheese-plate-lunch-3010062/\",\n" +
                "            \"previewURL\":\"https://cdn.pixabay.com/photo/2017/12/10/14/47/piza-3010062_150.jpg\",\n" +
                "            \"webformatURL\":\"https://pixabay.com/get/ea35b00f28f2033ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg\",\n" +
                "            \"imageWidth\":3400,\n" +
                "            \"user_id\":7340598,\n" +
                "            \"user\":\"zuzi99\",\n" +
                "            \"type\":\"photo\",\n" +
                "            \"id\":3010062,\n" +
                "            \"userImageURL\":\"\",\n" +
                "            \"imageHeight\":2270\n" +
                "        },\n" +
                "        {\n" +
                "            \"previewHeight\":99,\n" +
                "            \"likes\":18,\n" +
                "            \"favorites\":6,\n" +
                "            \"tags\":\"animal, bird, tit\",\n" +
                "            \"webformatHeight\":426,\n" +
                "            \"views\":143,\n" +
                "            \"webformatWidth\":640,\n" +
                "            \"previewWidth\":150,\n" +
                "            \"comments\":6,\n" +
                "            \"downloads\":89,\n" +
                "            \"pageURL\":\"https://pixabay.com/en/animal-bird-tit-parus-major-meal-3013559/\",\n" +
                "            \"previewURL\":\"https://cdn.pixabay.com/photo/2017/12/11/23/27/animal-3013559_150.jpg\",\n" +
                "            \"webformatURL\":\"https://pixabay.com/get/ea35b00c2df1083ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg\",\n" +
                "            \"imageWidth\":3702,\n" +
                "            \"user_id\":740865,\n" +
                "            \"user\":\"Oldiefan\",\n" +
                "            \"type\":\"photo\",\n" +
                "            \"id\":3013559,\n" +
                "            \"userImageURL\":\"https://cdn.pixabay.com/user/2016/06/08/21-49-55-294_250x250.jpg\",\n" +
                "            \"imageHeight\":2468\n" +
                "        }\n" +
                "    ],\n" +
                "    \"total\":560758\n" +
                "}";


        ProfileData profileData= new Gson().fromJson(imagesJson, ProfileData.class);
        return profileData.hits;
    }
}
