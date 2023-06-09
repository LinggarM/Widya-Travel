package com.incorps.widyatravel;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {

    private TextInputEditText txtNama, txtNoHP, txtEmail, txtPassword, txtAlamat;
    private Button btnSignUp;
    private static String URL_REGIST = "http://widya-travel.000webhostapp.com/api/api_register.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        txtNama = findViewById(R.id.nama_lengkap);
        txtNoHP = findViewById(R.id.no_handphone);
        txtEmail = findViewById(R.id.email);
        txtPassword = findViewById(R.id.password);
        txtAlamat = findViewById(R.id.alamat);

        btnSignUp = findViewById(R.id.sign_up);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mNama = txtNama.getText().toString().trim();
                String mNoHp = txtNoHP.getText().toString().trim();
                String mEmail = txtEmail.getText().toString().trim();
                String mPassword = txtPassword.getText().toString().trim();
                String mAlamat = txtAlamat.getText().toString().trim();

                if (mNama.isEmpty()) {
                    txtNama.setError("Please insert name");
                } else if (mNoHp.isEmpty()) {
                    txtNoHP.setError("Please insert phone number");
                } else if (mEmail.isEmpty()) {
                    txtEmail.setError("Please insert email");
                } else if (mPassword.isEmpty()) {
                    txtPassword.setError("Please insert password");
                } else if (mAlamat.isEmpty()) {
                    txtAlamat.setError("Please insert address");
                } else {
                    Regist();
                }
            }
        });


        TextView login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLogin = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intentLogin);
            }
        });
    }

    private void Regist(){

        final String nama = this.txtNama.getText().toString().trim();
        final String noHp = this.txtNoHP.getText().toString().trim();
        final String email = this.txtEmail.getText().toString().trim();
        final String password = this.txtPassword.getText().toString().trim();
        final String alamat = this.txtAlamat.getText().toString().trim();

        final ProgressDialog progressDialog =  new ProgressDialog(this);
        progressDialog.setMessage("Registering...");
        progressDialog.show();

        StringRequest stringRequest =  new StringRequest(Request.Method.POST, URL_REGIST,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{

                            progressDialog.dismiss();

                            JSONObject jsonObject =  new JSONObject(response);
                            String success = jsonObject.getString("success");

                            if (success.equals("1")) {
                                Toast.makeText(RegisterActivity.this, "Register Berhasil!", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(RegisterActivity.this, "Register Gagal! ", Toast.LENGTH_SHORT).show();
                            }
                        } catch (JSONException e) {
                            progressDialog.dismiss();

                            e.printStackTrace();
                            Toast.makeText(RegisterActivity.this, "Register Error!" + e.toString(), Toast.LENGTH_SHORT).show();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        progressDialog.dismiss();
                        Toast.makeText(RegisterActivity.this, "Register Error!" + error.toString(), Toast.LENGTH_SHORT).show();
                    }
                })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("nama", nama);
                params.put("noHp", noHp);
                params.put("email", email);
                params.put("password", password);
                params.put("alamat", alamat);
                return params;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}
