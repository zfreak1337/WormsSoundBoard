package com.example.wormssoundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

public class geezer extends AppCompatActivity {

    public SoundPool mSoundPool;
    public AssetManager mAssetManager;
    public int mStreamID;
    public int gezamazing;
    public int gezboring;
    private int gezbrilliant;
    private int gezbummer;
    private int gezbungle;
    private int gezbyebye;
    private int gezcollect;
    private int gezcomeonthen;
    private int gezcoward;
    private int gezdragonpunch;
    private int gezdrop;
    private int gezexellent;
    private int gezfatality;
    private int gezfire;
    private int gezfireball;
    private int gezfirstblood;
    private int gezflawless;
    private int gezgoaway;
    private int gezgrenade;
    private int gezhello;
    private int gezhurry;
    private int gezillgetyou;
    private int gezincoming;
    private int gezjump1;
    private int gezjump2;
    private int gezjustyouwait;
    private int gezkamikaze;
    private int gezlaugh;
    private int gezleavemealone;
    private int gezmissed;
    private int geznooo;
    private int gezohdear;
    public int gezoinutter;
    public int gezooff1;
    public int gezooff2;
    public int gezooff3;
    public int gezoops;
    public int gezorders;
    public int gezouch;
    public int gezow1;
    public int gezow2;
    public int gezow3;
    public int gezperfect;
    public int gezrevenge;
    public int gezrunaway;
    public int gezstupid;
    public int geztakecover;
    public int geztraitor;
    public int gezuhoh;
    public int gezvictoty;
    public int gezwatchthis;
    public int gezwhatthe;
    public int gezwobble;
    public int gezyessir;
    public int gezyoullregetthat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geezer);
        Button btnAmazing = findViewById(R.id.btnGezAmazing);
        btnAmazing.setOnClickListener(onClickListener);

        Button btnBoring = findViewById(R.id.btnGezBoring);
        btnBoring.setOnClickListener(onClickListener);

        Button btnBrilliant = findViewById(R.id.btnGezBrilliant);
        btnBrilliant.setOnClickListener(onClickListener);

        Button btnBummer = findViewById(R.id.btnGezBummer);
        btnBummer.setOnClickListener(onClickListener);

        Button btnBungee = findViewById(R.id.btnGezBungee);
        btnBungee.setOnClickListener(onClickListener);

        Button btnByebye= findViewById(R.id.btnGezByebye);
        btnByebye.setOnClickListener(onClickListener);

        Button btnCollect = findViewById(R.id.btnGezCollect);
        btnCollect.setOnClickListener(onClickListener);

        Button btnComeonthen = findViewById(R.id.btnGezComeonthen);
        btnComeonthen.setOnClickListener(onClickListener);

        Button btnCoward = findViewById(R.id.btnGezCoward);
        btnCoward.setOnClickListener(onClickListener);

        Button btnDroagonpunch = findViewById(R.id.btnGezDRAGONPUNCH);
        btnDroagonpunch.setOnClickListener(onClickListener);

        Button btnDrop = findViewById(R.id.btnGezDROP);
        btnDrop.setOnClickListener(onClickListener);

        Button btnExcellent = findViewById(R.id.btnGezEXCELLENT);
        btnExcellent.setOnClickListener(onClickListener);

        Button btnFatality = findViewById(R.id.btnGezFATALITY);
        btnFatality.setOnClickListener(onClickListener);

        Button btnFire = findViewById(R.id.btnGezFIRE);
        btnFire.setOnClickListener(onClickListener);

        Button btnFireball = findViewById(R.id.btnGezFIREBALL);
        btnFireball.setOnClickListener(onClickListener);

        Button btnFirstblood = findViewById(R.id.btnGezFIRSTBLOOD);
        btnFirstblood.setOnClickListener(onClickListener);

        Button btnFlawLess = findViewById(R.id.btnGezFLAWLESS);
        btnFlawLess.setOnClickListener(onClickListener);

        Button btnGrenade = findViewById(R.id.btnGezGRENADE);
        btnGrenade.setOnClickListener(onClickListener);

        Button btnHello = findViewById(R.id.btnGezHELLO);
        btnHello.setOnClickListener(onClickListener);

        Button btnHurry = findViewById(R.id.btnGezHURRY);
        btnHurry.setOnClickListener(onClickListener);


        Button btnIncoming = findViewById(R.id.btnGezINCOMING);
        btnIncoming.setOnClickListener(onClickListener);

        Button btnJump1 = findViewById(R.id.btnGezJUMP1);
        btnJump1.setOnClickListener(onClickListener);

        Button btnJump2 = findViewById(R.id.btnGezJUMP2);
        btnJump2.setOnClickListener(onClickListener);

        Button btnJustyouwait = findViewById(R.id.btnGezJUSTYOUWAIT);
        btnJustyouwait.setOnClickListener(onClickListener);

        Button btnKamikaze = findViewById(R.id.btnGezKAMIKAZE);
        btnKamikaze.setOnClickListener(onClickListener);

        Button btnLaugh = findViewById(R.id.btnGezLAUGH);
        btnLaugh.setOnClickListener(onClickListener);

        Button btnLeavemealone = findViewById(R.id.btnGezLEAVEMEALONE);
        btnLeavemealone.setOnClickListener(onClickListener);

        Button btnMissed = findViewById(R.id.btnGezMISSED);
        btnMissed.setOnClickListener(onClickListener);

        Button btnNooo = findViewById(R.id.btnGezNOOO);
        btnNooo.setOnClickListener(onClickListener);

        Button btnOhdear = findViewById(R.id.btnGezOHDEAR);
        btnOhdear.setOnClickListener(onClickListener);

        Button btnOinutter = findViewById(R.id.btnGezOINUTTER);
        btnOinutter.setOnClickListener(onClickListener);

        Button btnOoff1 = findViewById(R.id.btnGezOOFF1);
        btnOoff1.setOnClickListener(onClickListener);

        Button btnOoff2 = findViewById(R.id.btnGezOOFF2);
        btnOoff2.setOnClickListener(onClickListener);

        Button btnOoff3 = findViewById(R.id.btnGezOOFF3);
        btnOoff3.setOnClickListener(onClickListener);

        Button btnOops = findViewById(R.id.btnGezOOPS);
        btnOops.setOnClickListener(onClickListener);

        Button btnOrders = findViewById(R.id.btnGezORDERS);
        btnOrders.setOnClickListener(onClickListener);

        Button btnOuch = findViewById(R.id.btnGezOUCH);
        btnOuch.setOnClickListener(onClickListener);

        Button btnOw1 = findViewById(R.id.btnGezOW1);
        btnOw1.setOnClickListener(onClickListener);

        Button btnOw2 = findViewById(R.id.btnGezOW2);
        btnOw2.setOnClickListener(onClickListener);

        Button btnOw3 = findViewById(R.id.btnGezOW3);
        btnOw3.setOnClickListener(onClickListener);

        Button btnPerfect = findViewById(R.id.btnGezPERFECT);
        btnPerfect.setOnClickListener(onClickListener);

        Button btnRevenge = findViewById(R.id.btnGezREVENGE);
        btnRevenge.setOnClickListener(onClickListener);

        Button btnRunaway = findViewById(R.id.btnGezRUNAWAY);
        btnRunaway.setOnClickListener(onClickListener);

        Button btnStupid = findViewById(R.id.btnGezSTUPID);
        btnStupid.setOnClickListener(onClickListener);

        Button btnTakeCover = findViewById(R.id.btnGezTAKECOVER);
        btnTakeCover.setOnClickListener(onClickListener);

        Button btnTraitor = findViewById(R.id.btnGezTRAITOR);
        btnTraitor.setOnClickListener(onClickListener);

        Button btnUhoh = findViewById(R.id.btnGezUHOH);
        btnUhoh.setOnClickListener(onClickListener);

        Button btnVictory = findViewById(R.id.btnGezVICTORY);
        btnVictory.setOnClickListener(onClickListener);

        Button btnWatchthis = findViewById(R.id.btnGezWATCHTHIS);
        btnWatchthis.setOnClickListener(onClickListener);

        Button btnWhatthe = findViewById(R.id.btnGezWHATTHE);
        btnWhatthe.setOnClickListener(onClickListener);


        Button btnYessir = findViewById(R.id.btnGezYESSIR);
        btnYessir.setOnClickListener(onClickListener);

        Button btnYoullregretthat = findViewById(R.id.btnGezYOULLREGRETTHAT);
        btnYoullregretthat.setOnClickListener(onClickListener);



    }


    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnGezAmazing:
                    playSound(gezamazing);
                    break;
                case R.id.btnGezBoring:
                    playSound(gezboring);
                    break;
                case R.id.btnGezBrilliant:
                    playSound(gezbrilliant);
                    break;
                case R.id.btnGezBummer:
                    playSound(gezbummer);
                    break;
                case R.id.btnGezBungee:
                    playSound(gezbungle);
                    break;
                case R.id.btnGezByebye:
                    playSound(gezbyebye);
                    break;
                case R.id.btnGezCollect:
                    playSound(gezcollect);
                    break;
                case R.id.btnGezComeonthen:
                    playSound(gezcomeonthen);
                    break;
                case R.id.btnGezCoward:
                    playSound(gezcoward);
                    break;
                case R.id.btnGezDRAGONPUNCH:
                    playSound(gezdragonpunch);
                    break;
                case R.id.btnGezDROP:
                    playSound(gezdrop);
                    break;
                case R.id.btnGezEXCELLENT:
                    playSound(gezexellent);
                    break;
                case R.id.btnGezFATALITY:
                    playSound(gezfatality);
                    break;
                case R.id.btnGezFIRE:
                    playSound(gezfire);
                    break;
                case R.id.btnGezFIREBALL:
                    playSound(gezfireball);
                    break;
                case R.id.btnGezFIRSTBLOOD:
                    playSound(gezfirstblood);
                    break;
                case R.id.btnGezFLAWLESS:
                    playSound(gezflawless);
                    break;

                case R.id.btnGezHELLO:
                    playSound(gezhello);
                    break;
                case R.id.btnGezHURRY:
                    playSound(gezhurry);
                    break;
                case R.id.btnGezGRENADE:
                    playSound(gezgrenade);
                    break;
                case R.id.btnGezINCOMING:
                    playSound(gezincoming);
                    break;
                case R.id.btnGezJUMP1:
                    playSound(gezjump1);
                    break;
                case R.id.btnGezJUMP2:
                    playSound(gezjump2);
                    break;
                case R.id.btnGezJUSTYOUWAIT:
                    playSound(gezjustyouwait);
                    break;
                case R.id.btnGezKAMIKAZE:
                    playSound(gezkamikaze);
                    break;
                case R.id.btnGezLAUGH:
                    playSound(gezlaugh);
                    break;
                case R.id.btnGezLEAVEMEALONE:
                    playSound(gezleavemealone);
                    break;
                case R.id.btnGezMISSED:
                    playSound(gezmissed);
                    break;
                case R.id.btnGezNOOO:
                    playSound(geznooo);
                    break;
                case R.id.btnGezOHDEAR:
                    playSound(gezohdear);
                    break;
                case R.id.btnGezOINUTTER:
                    playSound(gezgrenade);
                    break;
                case R.id.btnGezOOFF1:
                    playSound(gezooff1);
                    break;
                case R.id.btnGezOOFF2:
                    playSound(gezooff2);
                    break;
                case R.id.btnGezOOFF3:
                    playSound(gezooff3);
                    break;
                case R.id.btnGezOOPS:
                    playSound(gezoops);
                    break;
                case R.id.btnGezORDERS:
                    playSound(gezorders);
                    break;
                case R.id.btnGezOUCH:
                    playSound(gezouch);
                    break;
                case R.id.btnGezOW1:
                    playSound(gezow1);
                    break;
                case R.id.btnGezOW2:
                    playSound(gezow2);
                    break;
                case R.id.btnGezOW3:
                    playSound(gezow3);
                    break;
                case R.id.btnGezPERFECT:
                    playSound(gezperfect);
                    break;
                case R.id.btnGezREVENGE:
                    playSound(gezrevenge);
                    break;
                case R.id.btnGezRUNAWAY:
                    playSound(gezrunaway);
                    break;
                case R.id.btnGezSTUPID:
                    playSound(gezstupid);
                    break;
                case R.id.btnGezTAKECOVER:
                    playSound(geztakecover);
                    break;
                case R.id.btnGezTRAITOR:
                    playSound(geztraitor);
                    break;
                case R.id.btnGezUHOH:
                    playSound(gezuhoh);
                    break;
                case R.id.btnGezVICTORY:
                    playSound(gezvictoty);
                    break;
                case R.id.btnGezWATCHTHIS:
                    playSound(gezwatchthis);
                    break;
                case R.id.btnGezWHATTHE:
                    playSound(gezwhatthe);
                    break;
                case R.id.btnGezYESSIR:
                    playSound(gezyessir);
                    break;
                case R.id.btnGezYOULLREGRETTHAT:
                    playSound(gezyoullregetthat);
                    break;



            }
        }
    };
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void createNewSoundPool() {
        AudioAttributes attributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();
        mSoundPool = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
    }
    @SuppressWarnings("deprecation")
    public void createOldSoundPool() {
        mSoundPool = new SoundPool(3, AudioManager.STREAM_MUSIC, 5);
    }
    public int playSound(int sound) {
        if (sound > 0) mStreamID = mSoundPool.play(sound, 1, 1, 1, 0, 1);
        return mStreamID;
    }

    private int loadSound(String fileName) {
        AssetFileDescriptor afd;
        try {
            afd = mAssetManager.openFd(fileName);
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), "Не могу загрузить файл " + fileName,
                    Toast.LENGTH_SHORT).show();
            return -1;
        }
        return mSoundPool.load(afd, 1);
    }
    @Override
    protected void onResume() {
        super.onResume();
        if (android.os.Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            // Для устройств до Android 5
            createOldSoundPool();
        } else {

            createNewSoundPool();
        }
        mAssetManager = getAssets();

        gezamazing = loadSound("gezamazing.wav");
        gezboring = loadSound("gezboring.wav");
        gezbrilliant = loadSound("gezbrilliant.wav");
        gezbummer = loadSound("gezbummer.wav");
        gezbungle = loadSound("gezbungee.wav");
        gezbyebye = loadSound("gezbyebye.wav");
        gezcollect = loadSound("gezcollect.wav");
        gezcomeonthen = loadSound("gezcomeonthen.wav");
        gezcoward = loadSound("gezcoward.wav");
        gezdragonpunch = loadSound("gezdragonpunch.wav");
        gezdrop = loadSound("gezdrop.wav");
        gezexellent = loadSound("gezexcellent.wav");
        gezfatality = loadSound("gezfatality.wav");
        gezfire = loadSound("gezfire.wav");
        gezfireball = loadSound("gezfireball.wav");
        gezfirstblood = loadSound("gezfirstblood.wav");
        gezflawless = loadSound("gezflawless.wav");
        gezgrenade = loadSound("gezgrenade.wav");
        gezhello = loadSound("gezhello.wav");
        gezhurry = loadSound("gezhurry.wav");
        gezincoming = loadSound("gezincoming.wav");
        gezjump1 = loadSound("gezjump1.wav");
        gezjump2 = loadSound("gezjump2.wav");
        gezjustyouwait = loadSound("gezjustyouwait.wav");
        gezlaugh = loadSound("gezlaugh.wav");
        gezleavemealone = loadSound("gezleavemealone.wav");
        gezmissed = loadSound("gezmissed.wav");
        geznooo = loadSound("geznooo.wav");
        gezohdear = loadSound("gezohdear.wav");
        gezoinutter = loadSound("gezoinutter.wav");
        gezooff1 = loadSound("gezoof1.wav");
        gezooff2 = loadSound("gezoof2.wav");
        gezooff3 = loadSound("gezoof3.wav");
        gezoops = loadSound("gezoops.wav");
        gezorders = loadSound("gezorders.wav");
        gezouch = loadSound("gezouch.wav");
        gezow1 = loadSound("gezow1.wav");
        gezkamikaze = loadSound("KAMIKAZE.WAV");
        gezow2 = loadSound("gezow2.wav");
        gezow3 = loadSound("gezow3.wav");
        gezperfect = loadSound("gezperfect.wav");
        gezrevenge = loadSound("gezrevenge.wav");
        gezrunaway = loadSound("gezrunaway.wav");
        gezstupid = loadSound("gezstupid.wav");
        geztakecover = loadSound("geztakecover.wav");
        geztraitor = loadSound("geztraitor.wav");
        gezuhoh = loadSound("gezuhoh.wav");
        gezvictoty = loadSound("gezvictory.wav");
        gezwatchthis = loadSound("gezwatchthis.wav");
        gezwhatthe = loadSound("gezwhatthe.wav");
        gezwobble = loadSound("WOBBLE.WAV");
        gezyessir = loadSound("gezyessir.wav");
        gezyoullregetthat = loadSound("gezyoullregretthat.wav");
        gezillgetyou = loadSound("ILLGETYOU.WAV");
    }
}
