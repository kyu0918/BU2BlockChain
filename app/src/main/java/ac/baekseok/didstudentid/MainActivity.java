package ac.baekseok.didstudentid;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText s_email,s_pwd;
    Button s_check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button S_sign_up=(Button)findViewById(R.id.S_sign_up); // 버튼을 클릭하면 회원가입창으로 이동

        S_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SignUp.class);
                startActivity(intent);
                finish();
            }
        });

        s_email = findViewById(R.id.s_email);
        s_pwd = findViewById(R.id.s_pwd);
        s_check = findViewById(R.id.s_check);

        s_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = s_email.getText().toString();
                String password = s_pwd.getText().toString();
                if (email.equals("") || password.equals("")){
                    Toast.makeText(getApplicationContext(), "사용자 이메일과 비밀번호를 입력하세요", Toast.LENGTH_SHORT).show();
                } else{
                    Intent intent = new Intent(getApplicationContext(), Bupass_studant.class);
                    intent.putExtra("tjdydwns123@bu.ac.kr", email);
                    startActivityForResult(intent, 1);
                    finish();
                }
            }
        });

    }
}