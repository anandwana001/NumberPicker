package com.wang.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.wang.demo.reminder_composer.ReminderComposerEdit;
import com.wang.demo.reminder_composer.ReminderContent;
import com.wang.demo.reminder_composer.ReminderEditExtraContent;
import com.wang.demo.reminder_composer.TestEdit;
import com.wang.ui.message_composer_layout.MessageComposerView;
import com.wang.ui.message_composer_layout.MessageComposerViewManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MessageComposerView view = findViewById(R.id.reminder_composer_view);
//        MessageComposerViewManager.newInstance(this, view).bindContentView(new ReminderContent(this))
//                .bindComposerView(new ReminderComposerEdit(this))
//                .bindAccessoryView(new ReminderEditExtraContent(this))
//                .bindAccessoryView(new TestEdit(this)).build();
    }
//
//    public void onClick(View v){
//        Intent intent;
//        switch (v.getId()){
//            case R.id.show_normal_picker:
//                intent = new Intent(MainActivity.this, NormalNumberPicker.class);
//                startActivity(intent);
//                break;
//            case R.id.show_unlimited_number_picker:
//                intent = new Intent(MainActivity.this, UnlimitedNumberPicker.class);
//                startActivity(intent);
//                break;
//            case R.id.show_week_day_picker:
//                intent = new Intent(MainActivity.this, WeekDayPicker.class);
//                startActivity(intent);
//                break;
//            case R.id.show_day_picker:
//                intent = new Intent(MainActivity.this, DayPicker.class);
//                startActivity(intent);
//                break;
//            case R.id.show_am_pm_picker:
//                intent = new Intent(MainActivity.this, AMPMPicker.class);
//                startActivity(intent);
//                break;
//            default:
//                break;
//        }
//    }


}
