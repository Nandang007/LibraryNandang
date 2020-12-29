package com.hirupmotekar.nandanglibrary;

import android.content.Context;
import android.widget.Toast;

public class KirimPesan {
    Context context;
    String pesan;

    public KirimPesan() {
    }

    public KirimPesan(Context context, String pesan) {
        this.context = context;
        this.pesan = pesan;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public void Kirim(Context context,String pesan){
        Toast.makeText(context, pesan, Toast.LENGTH_SHORT).show();
    }
}
