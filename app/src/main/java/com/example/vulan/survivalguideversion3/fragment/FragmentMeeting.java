  package com.example.vulan.survivalguideversion3.fragment;

  import android.content.Intent;
  import android.os.Bundle;
  import android.support.design.widget.FloatingActionButton;
  import android.support.v4.view.ViewPager;
  import android.view.LayoutInflater;
  import android.view.View;
  import android.view.ViewGroup;
  import android.widget.AdapterView;
  import android.widget.ImageView;
  import android.widget.ListView;

  import com.example.vulan.survivalguideversion3.R;
  import com.example.vulan.survivalguideversion3.app.BaseActivity;
  import com.example.vulan.survivalguideversion3.app.BaseFragment;
  import com.example.vulan.survivalguideversion3.database.DataSource;
  import com.example.vulan.survivalguideversion3.entity.EnglishGuide;
  import com.example.vulan.survivalguideversion3.entity.SubActionButton;

  import java.util.ArrayList;


  public class FragmentMeeting extends BaseFragment {
      private ListView lv;
      private ListGuideAdapter meetingAdapter;
      private ArrayList<EnglishGuide> englishGuideArrayList =new ArrayList<>();
      public static final String KEY_DETAIL="KEYDETAIL";
      FloatingActionButton floatingActionButton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

      protected boolean enableBackButton() {
          return true;
      }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_meeting, container, false);
        /*
       // floatingActionButton= (FloatingActionButton) view.findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadDataRecent();
            }
        });
        */
        lv = (ListView) view.findViewById(R.id.lvMeeting);
        LoadDataGuide();
        meetingAdapter= new ListGuideAdapter(getActivity(), englishGuideArrayList);

        lv.setAdapter(meetingAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //  Intent intent=new Intent(this,getBaseActivity().replace);
                Bundle bundle = new Bundle();
                bundle.putString(KEY_DETAIL, englishGuideArrayList.get(position).getFrenchSentence());
                FragmentViewdetail fragmentViewdetail = new FragmentViewdetail();
                fragmentViewdetail.setArguments(bundle);

                replaceFragment(getActivity().getFragmentManager(), fragmentViewdetail, englishGuideArrayList.get(position).getFrenchSentence(), englishGuideArrayList.get(position).getFrenchSentence());
            }
        });
        return view;

    }

      private void LoadDataGuide() {
          DataSource.getInstance().init(getActivity().getApplicationContext());
          DataSource.getInstance().createDatabaseIfNeed();
          englishGuideArrayList = DataSource.getInstance().getListLesson(1);
         // englishGuideArrayList = DataSource.getInstance().getListRecent(1);
      }

     private void LoadDataRecent(){
         DataSource.getInstance().init(getActivity().getApplicationContext());
         DataSource.getInstance().createDatabaseIfNeed();
         englishGuideArrayList = DataSource.getInstance().getListRecent(1);
     }

}
