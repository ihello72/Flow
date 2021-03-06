package kr.hs.dgsw.flow.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import kr.hs.dgsw.flow.R;

/**
 * 다음에 해야할 작업
 *
 * 1. 메인으로 이동
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goSchoolMealsIntent(View v) {
        Intent schoolMealsIntent = new Intent(MainActivity.this, MealActivity.class);
        startActivity(schoolMealsIntent);
    }

    public void goSignInIntent(View v) {
        Intent goLoginIntent = new Intent(MainActivity.this, SignInActivity.class);
        startActivity(goLoginIntent);
    }

    public void goSignUpIntent(View v) {
        Intent goLoginIntent = new Intent(MainActivity.this, SignUpActivity.class);
        startActivity(goLoginIntent);
    }

    public void goHomeIntent(View v) {
        Intent goHomeIntent = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(goHomeIntent);
    }
}
