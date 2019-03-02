package com.example.scout_4940;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class Chart extends Fragment {
        private static final String TAG = "chartfragment";

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
                View view = inflater.inflate(R.layout.chartfragment, container, false);
                return view;
        }



        public static class Screenshot {

                public static Bitmap takescreenshot(View v) {
                        v.setDrawingCacheEnabled(true);
                        v.buildDrawingCache(true);
                        Bitmap b = Bitmap.createBitmap(v.getDrawingCache());
                        v.setDrawingCacheEnabled(false);
                        return b;
                }

                public static Bitmap takescreenshotOfRootView(View v) {
                        return (Bitmap) takescreenshot(v.getRootView());
                }

        }

        public class MainActivity extends AppCompatActivity {

                private View main;
                private ImageView imageView;

            public MainActivity(View main) {
                this.main = main;
            }

            @Override
                protected void onCreate(Bundle savedInstanceState) {
                        super.onCreate(savedInstanceState);
                        setContentView(R.layout.chartfragment);
                        Button btn = (Button) findViewById(R.id.scrnsht);
                        btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                        Bitmap b = (Bitmap) Screenshot.takescreenshotOfRootView(imageView);
                                }
                        });
                }
        }
   /* public void storeScreenshot(Bitmap bitmap, String filename) {
        String path = Environment.getExternalStorageDirectory().toString() + "/" + filename;
        OutputStream out = null;
        File imageFile = new File(path);

        try {
            out = new FileOutputStream(imageFile);
            // choose JPEG format
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, out);
            out.flush();
        } catch (FileNotFoundException e) {
            // manage exception ...
        } catch (IOException e) {
            // manage exception ...
        } finally {

            try {
                if (out != null) {
                    out.close();
                }

            } catch (Exception exc) {
            }

        }
    }*/
}

