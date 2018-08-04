package com.example.lenovo.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.lenovo.calculator.IndexInToDuffix.Houzhui;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_0;
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    private Button btn_5;
    private Button btn_6;
    private Button btn_7;
    private Button btn_8;
    private Button btn_9;
    private Button btn_point;
    private Button btn_plus;
    private Button btn_sub;
    private Button btn_multi;
    private Button btn_div;
    private Button btn_left;
    private Button btn_right;

    private Button btn_ac;  //清空
    private Button btn_del;//删除
    private Button btn_equals;  //等号
    private TextView et_showview;
    boolean iferror = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    public void initView() {
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_point = (Button) findViewById(R.id.btn_point);
        btn_div = (Button) findViewById(R.id.btn_div);
        btn_plus = (Button) findViewById(R.id.btn_plus);
        btn_sub = (Button) findViewById(R.id.btn_sub);
        btn_multi = (Button) findViewById(R.id.btn_multi);

        btn_left = (Button) findViewById(R.id.btn_left);
        btn_right = (Button) findViewById(R.id.btn_right);
        btn_equals = (Button) findViewById(R.id.btn_equals);

        btn_ac = (Button) findViewById(R.id.btn_ac);
        btn_del = (Button) findViewById(R.id.btn_del);


        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_equals.setOnClickListener(this);
        btn_del.setOnClickListener(this);
        btn_right.setOnClickListener(this);
        btn_left.setOnClickListener(this);
        btn_multi.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_ac.setOnClickListener(this);
        btn_point.setOnClickListener(this);
        et_showview = (TextView) findViewById(R.id.msg);
    }

    @Override
    public void onClick(View view) {
        String str = et_showview.getText().toString();

        switch (view.getId()) {
            case R.id.btn_0:
                if (str.isEmpty() || str.charAt(str.length() - 1) != '/') {
                    str += "0";
                    et_showview.setText(str);
                }
                break;
            case R.id.btn_1:
                str += "1";
                et_showview.setText(str);
                break;
            case R.id.btn_2:
                str += "2";
                et_showview.setText(str);
                break;
            case R.id.btn_3:
                str += "3";
                et_showview.setText(str);
                break;
            case R.id.btn_4:
                str += "4";
                et_showview.setText(str);
                break;
            case R.id.btn_5:
                str += "5";
                et_showview.setText(str);
                break;
            case R.id.btn_6:
                str += "6";
                et_showview.setText(str);
                break;
            case R.id.btn_7:
                str += "7";
                et_showview.setText(str);
                break;
            case R.id.btn_8:
                str += "8";
                et_showview.setText(str);
                break;
            case R.id.btn_9:
                str += "9";
                et_showview.setText(str);
                break;
            case R.id.btn_div:
                if (str.length() != 0) {
                    if (str.charAt(str.length() - 1) != '+') {
                        if (str.charAt(str.length() - 1) != '-') {
                            if (str.charAt(str.length() - 1) != '*') {
                                if (str.charAt(str.length() - 1) != '/') {
                                    str += "/";
                                    et_showview.setText(str);
                                }
                            }
                        }
                    }
                }
                break;

            case R.id.btn_multi:
                if (str.length() != 0) {
                    if (str.charAt(str.length() - 1) != '+') {
                        if (str.charAt(str.length() - 1) != '-') {
                            if (str.charAt(str.length() - 1) != '*') {
                                if (str.charAt(str.length() - 1) != '/') {
                                    str += "*";
                                    et_showview.setText(str);
                                }
                            }
                        }
                    }
                }
                break;
            case R.id.btn_point:

                boolean flag = false;
                for (int i = str.length() - 1; i >= 0; i--) {
                    if (str.charAt(i) == '+')
                        break;
                    if (str.charAt(i) == '-')
                        break;
                    if (str.charAt(i) == '*')
                        break;
                    if (str.charAt(i) == '/')
                        break;
                    if (str.charAt(i) == ')')
                        break;
                    if (str.charAt(i) == '.') {
                        flag = true;
                        break;
                    }
                }
                if (flag == false) {
                    str += ".";
                    et_showview.setText(str);
                }
                break;
            case R.id.btn_plus:
                if (str.length() != 0) {
                    if (str.charAt(str.length() - 1) != '+') {
                        if (str.charAt(str.length() - 1) != '-') {
                            if (str.charAt(str.length() - 1) != '*') {
                                if (str.charAt(str.length() - 1) != '/') {
                                    str += "+";
                                    et_showview.setText(str);
                                }
                            }
                        }
                    }
                }
                break;
            case R.id.btn_sub:
                if (str.length() != 0) {
                    if (str.charAt(str.length() - 1) != '+') {
                        if (str.charAt(str.length() - 1) != '-') {
                            if (str.charAt(str.length() - 1) != '*') {
                                if (str.charAt(str.length() - 1) != '/') {
                                    str += "-";
                                    et_showview.setText(str);
                                }
                            }
                        }
                    }
                }

                break;
            //如果运算符和小数点不出现在首尾位置，可以添加进字符串里
            //小数点前一位必须是数字
            case R.id.btn_left:

                str += "(";
                et_showview.setText(str);
                break;
            case R.id.btn_right:
                str += ")";
                et_showview.setText(str);
                break;
            case R.id.btn_equals:
                if(str.length()==0)
                    break;
                StringBuilder st = new StringBuilder(str);
                for (int i = 1; i < st.length(); i++) {
                    if (st.charAt(i) == '-' && (st.charAt(i - 1) == '(')) {
                        st.insert(i, "0");
                    }
                }
                int m = 0;
                int n = 0;
                for (int j = 0; j < str.length(); j++) {

                    if (str.charAt(j) == '(')
                        m++;
                    else if (str.charAt(j) == ')')
                        n++;
                }
                if (iferror == true)
                    break;
                if (m != n) {
                    et_showview.setText("input error");
                    iferror = true;
                    break;
                }
                try {
                    et_showview.setText(IndexInToDuffix.calc(Houzhui(st)));   //输入结束，转为逆波兰表达式
                } catch (Exception e) {
                    et_showview.setText("calculate failed");
                }
                break;
            case R.id.btn_del:
                if (str.length() != 0)
                    str = str.substring(0, str.length() - 1);
                et_showview.setText(str);
                //如果字符串长度大于等于1，就前删一个字符
                break;
            case R.id.btn_ac:
                if (str.length() != 0)
                    str = "";
                et_showview.setText(str);
                break;
        }
    }

}



