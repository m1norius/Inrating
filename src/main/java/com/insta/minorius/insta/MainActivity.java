package com.insta.minorius.insta;

import android.content.Intent;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.insta.minorius.insta.response.user_token.TokenBody;
import com.insta.minorius.insta.response.user_token.TokenResponse;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.id_edit_txt_login)       EditText login;
    @BindView(R.id.id_edit_txt_password)    EditText password;
    @BindView(R.id.id_btn_enter)            Button enterBtn;

    String inputLogin;
    String inputPassword;

    String accessToken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        enterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputLogin = login.getText().toString();
                inputPassword = password.getText().toString();

                if (inputLogin.equals("") || inputPassword.equals("")){
                    Snackbar.make(enterBtn, "Заповніть всі поля", BaseTransientBottomBar.LENGTH_SHORT).show();
                }else {
                    RestService restService = App.getRest().create(RestService.class);
                    Call<TokenResponse> call = restService.getToken(new TokenBody(inputLogin, inputPassword));
                    call.enqueue(new Callback<TokenResponse>() {
                        @Override
                        public void onResponse(Call<TokenResponse> call, Response<TokenResponse> response) {
                            if (response.body()!=null){
                                accessToken = response.body().getAccessToken();
                                startActivity(new Intent(getApplicationContext(), UserPostsActivity.class).putExtra("TOKEN", accessToken));
                            }
                        }

                        @Override
                        public void onFailure(Call<TokenResponse> call, Throwable t) {

                        }
                    });
                }
            }
        });
    }
}
