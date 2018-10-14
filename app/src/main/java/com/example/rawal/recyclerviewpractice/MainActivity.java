package com.example.rawal.recyclerviewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<User> users;
    RecyclerView recyclerView;
    UserRecyclerAdapter userRecyclerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        recyclerView = findViewById( R.id.list );

        int viewId = R.drawable.berlin;
        User user1 = new User( viewId,"Berlin","La Casa De Papel" );
        viewId = R.drawable.castiel;
        User user2 = new User( viewId,"Castiel","Supernatural" );
        viewId = R.drawable.dean;
        User user3 = new User( viewId,"Dean Winchester","Supernatural" );
        viewId = R.drawable.jack;
        User user4 = new User( viewId,"Jack Shepherd","Lost" );
        viewId = R.drawable.kate;
        User user5 = new User( viewId,"Kate Austen","Lost" );
        viewId = R.drawable.sawyer;
        User user6 = new User( viewId,"Sawyer","Lost" );
        viewId = R.drawable.jane;
        User user7 = new User( viewId,"Jane Doe","Blindspot" );
        viewId = R.drawable.kurt;
        User user8 = new User( viewId,"Kurt Weller","Blindspot" );
        viewId = R.drawable.roman;
        User user9 = new User( viewId,"Roman","Blindspot" );
        viewId = R.drawable.richdotcom;
        User user10 = new User( viewId,"RichDotCom","Blindspot" );
        viewId = R.drawable.john;
        User user11 = new User( viewId,"John Watson","Sherlock Holmes BBC" );
        viewId = R.drawable.sherlock;
        User user12 = new User( viewId,"Sherlock Holmes","Sherlock Holmes BBC" );
        viewId = R.drawable.jon_snow;
        User user13 = new User( viewId,"Jon Snow","Game Of Thrones" );
        viewId = R.drawable.tyrion;
        User user14 = new User( viewId,"Tyrion Lannistor","Game Of Thrones" );
        viewId = R.drawable.michael;
        User user15 = new User( viewId,"Michael","Prison Break" );
        viewId = R.drawable.reddington;
        User user16 = new User( viewId,"Raymond Reddington","The Blacklist" );

        users = new ArrayList<>(  );
        users.add( user1 );
        users.add( user2 );
        users.add( user3 );
        users.add( user4 );
        users.add( user5 );
        users.add( user6 );
        users.add( user7 );
        users.add( user8 );
        users.add( user9 );
        users.add( user10 );
        users.add( user11 );
        users.add( user12 );
        users.add( user13 );
        users.add( user14 );
        users.add( user15 );
        users.add( user16 );

        userRecyclerAdapter = new UserRecyclerAdapter( this,R.layout.list_view,users );

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager( this );

        recyclerView.setLayoutManager( linearLayoutManager );
        recyclerView.setAdapter( userRecyclerAdapter );
    }
}
