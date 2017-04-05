package com.example.yo.a5week;

import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.icu.text.DateFormat;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.PluralsRes;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import junit.framework.Test;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by yo on 2017-03-30.
 */

public class Fragment1 extends Fragment {

    String tn;
    Data tb1,tb2,tb3,tb4 ;
    Button b5, b6, b7, bt1,bt2,bt3,bt4;
    EditText  e2, e3, e4, e5;
    RadioGroup rg;
    RadioButton rb1, rb2;
    TextView e1, t2,t4,t6,t8,t10,t12;
    int num ,rbnum = 0;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final View fragview = inflater.inflate(R.layout.fragment1, container, false);
        final View fragview1 = inflater.inflate(R.layout.box,container,false);



        tb1 = new Data("emp");
        tb2 = new Data("emp");
        tb3 = new Data("emp");
        tb4 = new Data("emp");

        e1 = (TextView)fragview1.findViewById(R.id.e1);
        e2 = (EditText)fragview.findViewById(R.id.e2);
        e3 = (EditText)fragview.findViewById(R.id.e3);
        e4 = (EditText)fragview.findViewById(R.id.e4);
        e5 = (EditText)fragview.findViewById(R.id.e5);
        rg = (RadioGroup)fragview.findViewById(R.id.rg);
        rb1 = (RadioButton)fragview.findViewById(R.id.rb1);
        rb2 = (RadioButton)fragview.findViewById(R.id.rb2);

        t2 = (TextView)fragview.findViewById(R.id.t2);
        t4 = (TextView)fragview.findViewById(R.id.t4);
        t6 = (TextView)fragview.findViewById(R.id.t6);
        t8 = (TextView)fragview.findViewById(R.id.t8);
        t10 = (TextView)fragview.findViewById(R.id.t10);
        t12 = (TextView)fragview.findViewById(R.id.t12);

        b5 = (Button)fragview.findViewById(R.id.b5);
        b6 = (Button)fragview.findViewById(R.id.b6);
        b7 = (Button)fragview.findViewById(R.id.b7);
        bt1 = (Button)fragview.findViewById(R.id.bt1);
        bt2 = (Button)fragview.findViewById(R.id.bt2);
        bt3 = (Button)fragview.findViewById(R.id.bt3);
        bt4 = (Button)fragview.findViewById(R.id.bt4);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 1;
                t2.setText("사과 테이블");
                tn = "apple";
                if(tb1.getTable() == "emp"){
                    Toast.makeText(getActivity(), "비어있는 테이블입니다.", Toast.LENGTH_SHORT).show();
                    t4.setText("");
                    t6.setText("");
                    t8.setText("");
                    t10.setText("");
                    t12.setText("");

                }
                else {

                    t4.setText(tb1.getDate() + "   " + tb1.getTime());
                    t6.setText(Integer.toString(tb1.getSpa()));
                    t8.setText(Integer.toString(tb1.getPizza()));
                    t10.setText(tb1.getMember());
                    t12.setText(Integer.toString(tb1.getPrice()));
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 2;
                t2.setText("포도 테이블");
                tn = "grape";
                if(tb2.getTable() == "emp"){
                    Toast.makeText(getActivity(), "비어있는 테이블입니다.", Toast.LENGTH_SHORT).show();
                    t4.setText("");
                    t6.setText("");
                    t8.setText("");
                    t10.setText("");
                    t12.setText("");

                }
                else {

                    t4.setText(tb2.getDate() + "   " + tb2.getTime());
                    t6.setText(Integer.toString(tb2.getSpa()));
                    t8.setText(Integer.toString(tb2.getPizza()));
                    t10.setText(tb2.getMember());
                    t12.setText(Integer.toString(tb2.getPrice()));
                }

            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 3;
                t2.setText("키위 테이블");

                tn = "kiwi";
                if(tb3.getTable() == "emp"){
                    Toast.makeText(getActivity(), "비어있는 테이블입니다.", Toast.LENGTH_SHORT).show();
                    t4.setText("");
                    t6.setText("");
                    t8.setText("");
                    t10.setText("");
                    t12.setText("");
                }
                else {

                    t4.setText(tb3.getDate() + "   " + tb3.getTime());
                    t6.setText(Integer.toString(tb3.getSpa()));
                    t8.setText(Integer.toString(tb3.getPizza()));
                    t10.setText(tb3.getMember());
                    t12.setText(Integer.toString(tb3.getPrice()));
                }



            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 4;
                t2.setText("자몽 테이블");
                tn = "jamong";

                if(tb4.getTable() == "emp"){
                    Toast.makeText(getActivity(), "비어있는 테이블입니다.", Toast.LENGTH_SHORT).show();
                    t4.setText("");
                    t6.setText("");
                    t8.setText("");
                    t10.setText("");
                    t12.setText("");
                }
                else {

                    t4.setText(tb4.getDate() + "   " + tb4.getTime());
                    t6.setText(Integer.toString(tb4.getSpa()));
                    t8.setText(Integer.toString(tb4.getPizza()));
                    t10.setText(tb4.getMember());
                    t12.setText(Integer.toString(tb4.getPrice()));
                }

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (num == 0){
                    Toast.makeText(getActivity(), "테이블을 선택해주세요", Toast.LENGTH_SHORT).show();
                }
                else {
                    final View dlgview = inflater.inflate(R.layout.box, null);
                    AlertDialog.Builder dlg = new AlertDialog.Builder(getActivity());

                    long now = System.currentTimeMillis();
                    Date date = new Date(now);
                    SimpleDateFormat CurDateFormat = new SimpleDateFormat("yyy/MM/dd");
                    SimpleDateFormat CurTimeFormat = new SimpleDateFormat("HH:mm");
                    final String strCurDate = CurDateFormat.format(date);
                    final String strCurTime = CurTimeFormat.format(date);
                    final TextView e1 = (TextView) dlgview.findViewById(R.id.e1);
                    final EditText e2 = (EditText) dlgview.findViewById(R.id.e2);
                    final EditText e3 = (EditText) dlgview.findViewById(R.id.e3);
                    final EditText e4 = (EditText) dlgview.findViewById(R.id.e4);
                    final EditText e5 = (EditText) dlgview.findViewById(R.id.e5);
                    final RadioButton rb1 = (RadioButton) dlgview.findViewById(R.id.rb1);
                    final RadioButton rb2 = (RadioButton) dlgview.findViewById(R.id.rb2);
                    final RadioGroup rg = (RadioGroup) dlgview.findViewById(R.id.rg);
                    final TextView t2 = (TextView) fragview.findViewById(R.id.t2);
                    final TextView t4 = (TextView) fragview.findViewById(R.id.t4);
                    final TextView t6 = (TextView) fragview.findViewById(R.id.t6);
                    final TextView t8 = (TextView) fragview.findViewById(R.id.t8);
                    final TextView t10 = (TextView) fragview.findViewById(R.id.t10);
                    final TextView t12 = (TextView) fragview.findViewById(R.id.t12);
                    e2.setText(strCurDate);
                    e3.setText(strCurTime);


                    if (num == 1) {
                        e1.setText("사과 테이블");
                    } else if (num == 2) {
                        e1.setText("포도 테이블");
                    } else if (num == 3) {
                        e1.setText("키위 테이블");
                    } else if (num == 4) {
                        e1.setText("자몽 테이블");
                    }

                    dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            if (e4.getText().toString().length() == 0 || e5.getText().toString().length() == 0) {
                                Toast.makeText(getActivity(), "정보를 입력해주세요", Toast.LENGTH_SHORT).show();

                            } else {
                                String table = e1.getText().toString();
                                String date = e2.getText().toString();
                                String time = e3.getText().toString();
                                String spa = e4.getText().toString();
                                String pizza = e5.getText().toString();
                                int price = Integer.parseInt(spa) * 10000 + Integer.parseInt(pizza) * 12000;
                                if (rb1.isChecked()) {
                                    price = price * 9 / 10;
                                    rbnum = 1;

                                } else if (rb2.isChecked()) {
                                    price = price * 7 / 10;
                                    rbnum = 2;
                                }
                                RadioButton rd = (RadioButton) dlgview.findViewById(rg.getCheckedRadioButtonId());
                                String member = rd.getText().toString();
                                if (tn == "apple") {
                                    tb1 = new Data(table, date, time, Integer.parseInt(spa), Integer.parseInt(pizza), member, price);
                                    bt1.setText("사과 Table");
                                    e1.setText(tb1.getTable());
                                    t4.setText(tb1.getDate() + "   " + tb1.getTime());
                                    t6.setText(Integer.toString(tb1.getSpa()));
                                    t8.setText(Integer.toString(tb1.getPizza()));
                                    t10.setText(tb1.getMember());
                                    t12.setText(Integer.toString(tb1.getPrice()));
                                } else if (tn == "grape") {
                                    tb2 = new Data(table, date, time, Integer.parseInt(spa), Integer.parseInt(pizza), member, price);
                                    bt2.setText("포도 Table");
                                    e1.setText(tb2.getTable());
                                    t4.setText(tb2.getDate() + "   " + tb2.getTime());
                                    t6.setText(Integer.toString(tb2.getSpa()));
                                    t8.setText(Integer.toString(tb2.getPizza()));
                                    t10.setText(tb2.getMember());
                                    t12.setText(Integer.toString(tb2.getPrice()));
                                } else if (tn == "kiwi") {

                                    tb3 = new Data(table, date, time, Integer.parseInt(spa), Integer.parseInt(pizza), member, price);
                                    bt3.setText("키위 Table");
                                    e1.setText(tb3.getTable());
                                    t4.setText(tb3.getDate() + "   " + tb3.getTime());
                                    t6.setText(Integer.toString(tb3.getSpa()));
                                    t8.setText(Integer.toString(tb3.getPizza()));
                                    t10.setText(tb3.getMember());
                                    t12.setText(Integer.toString(tb3.getPrice()));
                                } else if (tn == "jamong") {
                                    tb4 = new Data(table, date, time, Integer.parseInt(spa), Integer.parseInt(pizza), member, price);
                                    bt4.setText("자몽 Table");
                                    e1.setText(tb4.getTable());
                                    t4.setText(tb4.getDate() + "   " + tb4.getTime());
                                    t6.setText(Integer.toString(tb4.getSpa()));
                                    t8.setText(Integer.toString(tb4.getPizza()));
                                    t10.setText(tb4.getMember());
                                    t12.setText(Integer.toString(tb4.getPrice()));
                                }
                                Snackbar.make(getView(), "정보가 입력되었습니다.", 1000).show();
                            }

                        }
                    });
                    dlg.setTitle("새주문");
                    dlg.setView(dlgview);
                    dlg.show();
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num ==0){
                    Toast.makeText(getActivity(), "테이블을 선택해주세요", Toast.LENGTH_SHORT).show();
                }
                else {
                    final View dlgview = inflater.inflate(R.layout.box, null);
                    AlertDialog.Builder dlg = new AlertDialog.Builder(getActivity());

                    final TextView e1 = (TextView) dlgview.findViewById(R.id.e1);
                    final EditText e2 = (EditText) dlgview.findViewById(R.id.e2);
                    final EditText e3 = (EditText) dlgview.findViewById(R.id.e3);
                    final EditText e4 = (EditText) dlgview.findViewById(R.id.e4);
                    final EditText e5 = (EditText) dlgview.findViewById(R.id.e5);
                    final RadioButton rb1 = (RadioButton) dlgview.findViewById(R.id.rb1);
                    final RadioButton rb2 = (RadioButton) dlgview.findViewById(R.id.rb2);
                    final RadioGroup rg = (RadioGroup) dlgview.findViewById(R.id.rg);
                    final TextView t2 = (TextView) fragview.findViewById(R.id.t2);
                    final TextView t4 = (TextView) fragview.findViewById(R.id.t4);
                    final TextView t6 = (TextView) fragview.findViewById(R.id.t6);
                    final TextView t8 = (TextView) fragview.findViewById(R.id.t8);
                    final TextView t10 = (TextView) fragview.findViewById(R.id.t10);
                    final TextView t12 = (TextView) fragview.findViewById(R.id.t12);


                    if (num == 1) {
                        if (rbnum == 1) {
                            rb1.setChecked(true);
                            rb2.setChecked(false);
                        } else if (rbnum == 2) {
                            rb1.setChecked(false);
                            rb2.setChecked(true);
                        }
                        e2.setText(tb1.getDate());
                        e2.setFocusable(false);
                        e2.setClickable(false);
                        e3.setText(tb1.getTime());
                        e3.setFocusable(false);
                        e3.setClickable(false);
                        e1.setText("사과 테이블");
                        e4.setText(Integer.toString(tb1.getSpa()));
                        e5.setText(Integer.toString(tb1.getPizza()));

                        t10.setText(tb1.getMember());
                    } else if (num == 2) {
                        if (rbnum == 1) {
                            rb1.setChecked(true);
                            rb2.setChecked(false);
                        } else if (rbnum == 2) {
                            rb1.setChecked(false);
                            rb2.setChecked(true);
                        }
                        e2.setText(tb2.getDate());
                        e2.setFocusable(false);
                        e2.setClickable(false);
                        e3.setText(tb2.getTime());
                        e3.setFocusable(false);
                        e3.setClickable(false);
                        e1.setText("포도 테이블");
                        e4.setText(Integer.toString(tb2.getSpa()));
                        e5.setText(Integer.toString(tb2.getPizza()));
                    } else if (num == 3) {
                        if (rbnum == 1) {
                            rb1.setChecked(true);
                            rb2.setChecked(false);
                        } else if (rbnum == 2) {
                            rb1.setChecked(false);
                            rb2.setChecked(true);
                        }
                        e2.setText(tb3.getDate());
                        e2.setFocusable(false);
                        e2.setClickable(false);
                        e3.setText(tb3.getTime());
                        e3.setFocusable(false);
                        e3.setClickable(false);
                        e1.setText("키위 테이블");
                        e4.setText(Integer.toString(tb3.getSpa()));
                        e5.setText(Integer.toString(tb3.getPizza()));
                    } else if (num == 4) {
                        if (rbnum == 1) {
                            rb1.setChecked(true);
                            rb2.setChecked(false);
                        } else if (rbnum == 2) {
                            rb1.setChecked(false);
                            rb2.setChecked(true);
                        }
                        e2.setText(tb4.getDate());
                        e2.setFocusable(false);
                        e2.setClickable(false);
                        e3.setText(tb4.getTime());
                        e3.setFocusable(false);
                        e3.setClickable(false);
                        e1.setText("자몽 테이블");
                        e4.setText(Integer.toString(tb4.getSpa()));
                        e5.setText(Integer.toString(tb4.getPizza()));
                    }

                    dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            if (e4.getText().toString().length() == 0 || e5.getText().toString().length() == 0) {
                                Toast.makeText(getActivity(), "정보를 입력해주세요", Toast.LENGTH_SHORT).show();

                            } else {
                                String table = e1.getText().toString();
                                String date = e2.getText().toString();
                                String time = e3.getText().toString();
                                String spa = e4.getText().toString();
                                String pizza = e5.getText().toString();
                                int price = Integer.parseInt(spa) * 10000 + Integer.parseInt(pizza) * 12000;
                                if (rb1.isChecked()) {
                                    price = price * 9 / 10;
                                    rbnum = 1;
                                } else if (rb2.isChecked()) {
                                    price = price * 7 / 10;
                                    rbnum = 2;
                                }
                                RadioButton rd = (RadioButton) dlgview.findViewById(rg.getCheckedRadioButtonId());
                                String member = rd.getText().toString();
                                if (tn == "apple") {
                                    tb1 = new Data(table, date, time, Integer.parseInt(spa), Integer.parseInt(pizza), member, price);
                                    e1.setText(tb1.getTable());
                                    t4.setText(tb1.getDate() + "   " + tb1.getTime());
                                    t6.setText(Integer.toString(tb1.getSpa()));
                                    t8.setText(Integer.toString(tb1.getPizza()));
                                    t10.setText(tb1.getMember());
                                    t12.setText(Integer.toString(tb1.getPrice()));
                                } else if (tn == "grape") {
                                    tb2 = new Data(table, date, time, Integer.parseInt(spa), Integer.parseInt(pizza), member, price);
                                    e1.setText(tb2.getTable());
                                    t4.setText(tb2.getDate() + "   " + tb2.getTime());
                                    t6.setText(Integer.toString(tb2.getSpa()));
                                    t8.setText(Integer.toString(tb2.getPizza()));
                                    t10.setText(tb2.getMember());
                                    t12.setText(Integer.toString(tb2.getPrice()));
                                } else if (tn == "kiwi") {
                                    tb3 = new Data(table, date, time, Integer.parseInt(spa), Integer.parseInt(pizza), member, price);
                                    e1.setText(tb3.getTable());
                                    t4.setText(tb3.getDate() + "   " + tb3.getTime());
                                    t6.setText(Integer.toString(tb3.getSpa()));
                                    t8.setText(Integer.toString(tb3.getPizza()));
                                    t10.setText(tb3.getMember());
                                    t12.setText(Integer.toString(tb3.getPrice()));
                                } else if (tn == "jamong") {
                                    tb4 = new Data(table, date, time, Integer.parseInt(spa), Integer.parseInt(pizza), member, price);
                                    e1.setText(tb4.getTable());
                                    t4.setText(tb4.getDate() + "   " + tb4.getTime());
                                    t6.setText(Integer.toString(tb4.getSpa()));
                                    t8.setText(Integer.toString(tb4.getPizza()));
                                    t10.setText(tb4.getMember());
                                    t12.setText(Integer.toString(tb4.getPrice()));
                                }
                                Snackbar.make(getView(), "정보가 수정되었습니다..", 1000).show();
                            }

                        }
                    });
                    dlg.setTitle("정보수정");
                    dlg.setView(dlgview);
                    dlg.show();
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num == 0) {
                    Toast.makeText(getActivity(), "테이블을 선택해주세요", Toast.LENGTH_SHORT).show();
                } else {
                    t4.setText("");
                    t6.setText("");
                    t8.setText("");
                    t10.setText("");
                    t12.setText("");

                    if (num == 1) {
                        bt1.setText("사과 Table (비어있음)");
                        tb1.setDate("");
                        tb1.setTime("");
                        tb1.setPizza(0);
                        tb1.setSpa(0);
                        tb1.setMember("");
                        tb1.setPrice(0);
                    } else if (num == 2) {
                        bt2.setText("포도 Table (비어있음)");
                        tb2.setDate("");
                        tb2.setTime("");
                        tb2.setPizza(0);
                        tb2.setSpa(0);
                        tb2.setMember("");
                        tb2.setPrice(0);
                    } else if (num == 3) {
                        bt3.setText("키위 Table (비어있음)");
                        tb3.setDate("");
                        tb3.setTime("");
                        tb3.setPizza(0);
                        tb3.setSpa(0);
                        tb3.setMember("");
                        tb3.setPrice(0);
                    } else if (num == 4) {
                        bt4.setText("자몽 Table (비어있음)");
                        tb4.setDate("");
                        tb4.setTime("");
                        tb4.setPizza(0);
                        tb4.setSpa(0);
                        tb4.setMember("");
                        tb4.setPrice(0);
                    }
                    Snackbar.make(getView(), "초기화 되었습니다.", 1000).show();

                }
            }
        });

        return fragview;
    }

}