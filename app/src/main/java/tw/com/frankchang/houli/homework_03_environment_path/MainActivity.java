package tw.com.frankchang.houli.homework_03_environment_path;

import android.os.Build;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private TextView tvshow_01, tvshow_02, tvshow_03;
    private TextView tvshow_04, tvshow_05, tvshow_06;
    private TextView tvshow_07;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        finviewer();
    }

    @Override
    protected void onResume() {
        super.onResume();

        getShowPath();
    }

    private void finviewer() {
        tvshow_01 = (TextView) findViewById(R.id.textView);
        tvshow_02 = (TextView) findViewById(R.id.textView2);
        tvshow_03 = (TextView) findViewById(R.id.textView3);
        tvshow_04 = (TextView) findViewById(R.id.textView4);
        tvshow_05 = (TextView) findViewById(R.id.textView5);
        tvshow_06 = (TextView) findViewById(R.id.textView6);
        tvshow_07 = (TextView) findViewById(R.id.textView7);
    }

    /*static File 	getDataDirectory()

    返回用戶數據目錄。
    static File 	getDownloadCacheDirectory()

    返回下載/緩存內容目錄。
    static File 	getExternalStorageDirectory()

    返回主共享/外部存儲目錄。
    static File 	getExternalStoragePublicDirectory(String type)

    獲取頂級共享/外部存儲目錄，以放置特定類型的文件。
    static String 	getExternalStorageState()

    返回主共享/外部存儲介質的當前狀態。
    static String 	getExternalStorageState(File path)

    返回給定路徑上的共享/外部存儲介質的當前狀態。
    static File 	getRootDirectory()

    返回保存核心Android操作系統的“系統”分區的根。*/

    private void getShowPath() {
        //
        tvshow_01.setText(Environment.getDataDirectory().toString());
        //
        tvshow_02.setText(Environment.getDownloadCacheDirectory().toString());
        //
        tvshow_03.setText(Environment.getExternalStorageDirectory().toString());
        //
        tvshow_04.setText(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).toString());
        //
        tvshow_05.setText(Environment.getExternalStorageState());
        //
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            File path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);
            tvshow_06.setText(Environment.getExternalStorageState(path));
        }
        //
        tvshow_07.setText(Environment.getRootDirectory().toString());
    }
}
