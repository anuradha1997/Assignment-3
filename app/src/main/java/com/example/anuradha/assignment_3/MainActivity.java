package com.example.anuradha.assignment_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner s1;
    Spinner s2;
    String city[];
    String bity[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1= (Spinner) findViewById(R.id.sg);
        city=getResources().getStringArray(R.array.country);
         ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,city);
        s1.setAdapter(adapter);
        s1.setPrompt("select Country");

        s2= (Spinner) findViewById(R.id.sg2);

        bity=getResources().getStringArray(R.array.Select);
        final ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,bity);

        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {@Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              if(position==0)
                {
                   s2.setVisibility(View.INVISIBLE);
                }
                else if (position==1){
                  s2.setAdapter(ad);
                  s2.setVisibility(View.VISIBLE);
            }
            else if (position==2)
              {
                  s2.setAdapter(ad);
                  s2.setVisibility(View.VISIBLE);
              }
              else if (position==3)
              {
                  s2.setAdapter(ad);
                  s2.setVisibility(View.VISIBLE);
              }
              else if (position==4)
              {
                  s2.setAdapter(ad);
                  s2.setVisibility(View.VISIBLE);
              }
              else if (position==5)
              {
                  s2.setAdapter(ad);
                  s2.setVisibility(View.VISIBLE);
              }
              else if (position==6)
              {
                  s2.setAdapter(ad);
                  s2.setVisibility(View.VISIBLE);
              }
              else if (position==7)
              {
                  s2.setAdapter(ad);
                  s2.setVisibility(View.VISIBLE);
              }
              else if (position==8)
              {
                  s2.setAdapter(ad);
                  s2.setVisibility(View.VISIBLE);
              }
              else if (position==9)
              {
                  s2.setAdapter(ad);
                  s2.setVisibility(View.VISIBLE);
              }
              else if (position==10)
              {
                  s2.setAdapter(ad);
                  s2.setVisibility(View.VISIBLE);
              }
              else if (position==11)
              {
                  s2.setAdapter(ad);
                  s2.setVisibility(View.VISIBLE);
              }
              else if (position==12)
              {
                  s2.setAdapter(ad);
                  s2.setVisibility(View.VISIBLE);
              }
              else if (position==13)
              {
                  s2.setAdapter(ad);
                  s2.setVisibility(View.VISIBLE);
              }else if (position==14)
              {
                  s2.setAdapter(ad);
                  s2.setVisibility(View.VISIBLE);
              }



            s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if(position==1)
                    {
                        Toast.makeText(MainActivity.this, ""+bity[1], Toast.LENGTH_SHORT).show();
                    }
                    else if (position==2)
                    {
                        Toast.makeText(MainActivity.this, ""+bity[2], Toast.LENGTH_SHORT).show();
                    }
                    else if (position==3)
                    {
                        Toast.makeText(MainActivity.this, ""+bity[3], Toast.LENGTH_SHORT).show();
                    }
                    else if (position==4)
                    {
                        Toast.makeText(MainActivity.this, ""+bity[4], Toast.LENGTH_SHORT).show();
                    }
                    else if (position==5)
                    {
                        Toast.makeText(MainActivity.this, ""+bity[5], Toast.LENGTH_SHORT).show();
                    }
                    else if (position==6)
                    {
                        Toast.makeText(MainActivity.this, ""+bity[6], Toast.LENGTH_SHORT).show();
                    }
                    else if (position==7)
                    {
                        Toast.makeText(MainActivity.this, ""+bity[7], Toast.LENGTH_SHORT).show();
                    }
                    else if (position==8)
                    {
                        Toast.makeText(MainActivity.this, ""+bity[8], Toast.LENGTH_SHORT).show();
                    }
                    else if (position==9)
                    {
                        Toast.makeText(MainActivity.this, ""+bity[9], Toast.LENGTH_SHORT).show();
                    }
                    else if (position==10)
                    {
                        Toast.makeText(MainActivity.this, ""+bity[10], Toast.LENGTH_SHORT).show();
                    } else if (position==11)
                    {
                        Toast.makeText(MainActivity.this, ""+bity[11], Toast.LENGTH_SHORT).show();
                    }
                    else if (position==12)
                    {
                        Toast.makeText(MainActivity.this, ""+bity[12], Toast.LENGTH_SHORT).show();
                    }
                    else if (position==13)
                    {
                        Toast.makeText(MainActivity.this, ""+bity[13], Toast.LENGTH_SHORT).show();
                    }
                    else if (position==14)
                    {
                        Toast.makeText(MainActivity.this, ""+bity[14], Toast.LENGTH_SHORT).show();
                    }
                    else if (position==15)
                    {
                        Toast.makeText(MainActivity.this, ""+bity[15], Toast.LENGTH_SHORT).show();
                    }
                    else if (position==15)
                    {
                        Toast.makeText(MainActivity.this, ""+bity[16], Toast.LENGTH_SHORT).show();
                    }

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });


            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
