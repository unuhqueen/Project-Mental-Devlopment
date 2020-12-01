package com.example.prefinal;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class DownTable extends StringRequest {

    // 서버 URL 설정
    final static private String URL = "http://amine95.dothome.co.kr/Downtable.php";
    private Map<String, String> map;

    public DownTable(String userMail, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("userMail", userMail);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}