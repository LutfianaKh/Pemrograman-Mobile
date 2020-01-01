package com.lutfiana.mybackgroundthread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.lang.ref.WeakReference;

public class MainActivity extends AppCompatActivity implements MyAsyncCallBack {

    private TextView tvStatus;
    private TextView tvDesc;

    private final static String INPUT_STRING = "Halo ini Demo AsyncTask!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvStatus = findViewById(R.id.tv_status);
        tvDesc = findViewById(R.id.tv_desc);

        DemoAsync demoAsync = new DemoAsync(this);
        demoAsync.execute(INPUT_STRING);
    }

    @Override
    public void onPreExecute() {
        tvStatus.setText(R.string.status_pre);
        tvDesc.setText(INPUT_STRING);
    }

    @Override
    public void onPostExecute(String result) {
        tvStatus.setText(R.string.status_post);
        if (result != null) {
            tvDesc.setText(result);
        }
    }

    private static class DemoAsync extends AsyncTask<String, Void, String> {
        static final String LOG_ASYNC = "DemoAsyn";
        WeakReference<MyAsyncCallBack> myListener;

        DemoAsync(MyAsyncCallBack myListener) {
            this.myListener = new WeakReference<>(myListener);
        }

        protected void onPreExecute() {
            super.onPreExecute();
            Log.d(LOG_ASYNC, "Status : onPreExecute");

            MyAsyncCallBack myListener = this.myListener.get();
            if (myListener != null) {
                myListener.onPreExecute();
            }
        }

        @Override
        protected String doInBackground(String... params) {
            Log.d(LOG_ASYNC, "status : doInBackround");
            String output = null;
            try {
                String input = params[0];
                output = input + "Selamat Belajar!!";
                Thread.sleep(2000);
            } catch (Exception e) {
                Log.d(LOG_ASYNC, e.getMessage());
            }
            return null;
        }

        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            Log.d(LOG_ASYNC, "Status : onPostExecute");

            MyAsyncCallBack myListener = this.myListener.get();
            if (myListener != null) {
                myListener.onPostExecute(result);
            }
        }
    }
}
interface MyAsyncCallBack {
    void onPreExecute();

    void onPostExecute(String text);
}