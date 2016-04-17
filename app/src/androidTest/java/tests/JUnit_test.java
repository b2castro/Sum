package tests;

import android.support.annotation.MainThread;
import android.test.ActivityInstrumentationTestCase2;

import com.android.findsum.MainActivity;

/**
 * Created by bryle on 4/16/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;

    public JUnit_test() {
        super(MainActivity.class);
    }

    public void test_first() {
        mainActivity = getActivity();
        int number = mainActivity.sum(1,2);
        assertEquals(3,number);
    }

}
