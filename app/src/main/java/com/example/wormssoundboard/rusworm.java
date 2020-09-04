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

public class rusworm extends AppCompatActivity {
    public SoundPool mSoundPool;
    public AssetManager mAssetManager;
    public int mStreamID;
    public int rusamazing;
    public int rusboring;
    private int rusbrilliant;
    private int rusbummer;
    private int rusbungle;
    private int rusbyebye;
    private int ruscollect;
    private int ruscomeonthen;
    private int ruscoward;
    private int rusdragonpunch;
    private int rusdrop;
    private int rusexellent;
    private int rusfatality;
    private int rusfire;
    private int rusfireball;
    private int rusfirstblood;
    private int rusflawless;
    private int rusgoaway;
    private int rusgrenade;
    private int rushello;
    private int rushurry;
    private int rusillgetyou;
    private int rusincoming;
    private int rusjump1;
    private int rusjump2;
    private int rusjustyouwait;
    private int ruskamikaze;
    private int ruslaugh;
    private int rusleavemealone;
    private int rusmissed;
    private int rusnooo;
    private int rusohdear;
    public int rusoinutter;
    public int rusooff1;
    public int rusooff2;
    public int rusooff3;
    public int rusoops;
    public int rusorders;
    public int rusouch;
    public int rusow1;
    public int rusow2;
    public int rusow3;
    public int rusperfect;
    public int rusrevenge;
    public int rusrunaway;
    public int russtupid;
    public int rustakecover;
    public int rustraitor;
    public int rusuhoh;
    public int rusvictoty;
    public int ruswatchthis;
    public int ruswhatthe;
    public int ruswobble;
    public int rusyessir;
    public int rusyoullregetthat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rusworm);
        Button btnAmazing = findViewById(R.id.btnRusAmazing);
        btnAmazing.setOnClickListener(onClickListener);

        Button btnBoring = findViewById(R.id.btnRusBoring);
        btnBoring.setOnClickListener(onClickListener);

        Button btnBrilliant = findViewById(R.id.btnRusBrilliant);
        btnBrilliant.setOnClickListener(onClickListener);

        Button btnBummer = findViewById(R.id.btnRusBummer);
        btnBummer.setOnClickListener(onClickListener);

        Button btnBungee = findViewById(R.id.btnRusBungee);
        btnBungee.setOnClickListener(onClickListener);

        Button btnByebye= findViewById(R.id.btnRusByebye);
        btnByebye.setOnClickListener(onClickListener);

        Button btnCollect = findViewById(R.id.btnRusCollect);
        btnCollect.setOnClickListener(onClickListener);

        Button btnComeonthen = findViewById(R.id.btnRusComeonthen);
        btnComeonthen.setOnClickListener(onClickListener);

        Button btnCoward = findViewById(R.id.btnRusCoward);
        btnCoward.setOnClickListener(onClickListener);

        Button btnDroagonpunch = findViewById(R.id.btnRusDRAGONPUNCH);
        btnDroagonpunch.setOnClickListener(onClickListener);

        Button btnDrop = findViewById(R.id.btnRusDROP);
        btnDrop.setOnClickListener(onClickListener);

        Button btnExcellent = findViewById(R.id.btnRusEXCELLENT);
        btnExcellent.setOnClickListener(onClickListener);

        Button btnFatality = findViewById(R.id.btnRusFATALITY);
        btnFatality.setOnClickListener(onClickListener);

        Button btnFire = findViewById(R.id.btnRusFIRE);
        btnFire.setOnClickListener(onClickListener);

        Button btnFireball = findViewById(R.id.btnRusFIREBALL);
        btnFireball.setOnClickListener(onClickListener);

        Button btnFirstblood = findViewById(R.id.btnRusFIRSTBLOOD);
        btnFirstblood.setOnClickListener(onClickListener);

        Button btnFlawLess = findViewById(R.id.btnRusFLAWLESS);
        btnFlawLess.setOnClickListener(onClickListener);

        Button btnGoaway = findViewById(R.id.btnRusGOAWAY);
        btnGoaway.setOnClickListener(onClickListener);

        Button btnGrenade = findViewById(R.id.btnRusGRENADE);
        btnGrenade.setOnClickListener(onClickListener);

        Button btnHello = findViewById(R.id.btnRusHELLO);
        btnHello.setOnClickListener(onClickListener);

        Button btnHurry = findViewById(R.id.btnRusHURRY);
        btnHurry.setOnClickListener(onClickListener);

        Button btnIllegetyou = findViewById(R.id.btnRusILLGETYOU);
        btnIllegetyou.setOnClickListener(onClickListener);

        Button btnIncoming = findViewById(R.id.btnRusINCOMING);
        btnIncoming.setOnClickListener(onClickListener);

        Button btnJump1 = findViewById(R.id.btnRusJUMP1);
        btnJump1.setOnClickListener(onClickListener);

        Button btnJump2 = findViewById(R.id.btnRusJUMP2);
        btnJump2.setOnClickListener(onClickListener);

        Button btnJustyouwait = findViewById(R.id.btnRusJUSTYOUWAIT);
        btnJustyouwait.setOnClickListener(onClickListener);

        Button btnKamikaze = findViewById(R.id.btnRusKAMIKAZE);
        btnKamikaze.setOnClickListener(onClickListener);

        Button btnLaugh = findViewById(R.id.btnRusLAUGH);
        btnLaugh.setOnClickListener(onClickListener);

        Button btnLeavemealone = findViewById(R.id.btnRusLEAVEMEALONE);
        btnLeavemealone.setOnClickListener(onClickListener);

        Button btnMissed = findViewById(R.id.btnRusMISSED);
        btnMissed.setOnClickListener(onClickListener);

        Button btnNooo = findViewById(R.id.btnRusNOOO);
        btnNooo.setOnClickListener(onClickListener);

        Button btnOhdear = findViewById(R.id.btnRusOHDEAR);
        btnOhdear.setOnClickListener(onClickListener);

        Button btnOinutter = findViewById(R.id.btnRusOINUTTER);
        btnOinutter.setOnClickListener(onClickListener);

        Button btnOoff1 = findViewById(R.id.btnRusOOFF1);
        btnOoff1.setOnClickListener(onClickListener);

        Button btnOoff2 = findViewById(R.id.btnRusOOFF2);
        btnOoff2.setOnClickListener(onClickListener);

        Button btnOoff3 = findViewById(R.id.btnRusOOFF3);
        btnOoff3.setOnClickListener(onClickListener);

        Button btnOops = findViewById(R.id.btnRusOOPS);
        btnOops.setOnClickListener(onClickListener);

        Button btnOrders = findViewById(R.id.btnRusORDERS);
        btnOrders.setOnClickListener(onClickListener);

        Button btnOuch = findViewById(R.id.btnRusOUCH);
        btnOuch.setOnClickListener(onClickListener);

        Button btnOw1 = findViewById(R.id.btnRusOW1);
        btnOw1.setOnClickListener(onClickListener);

        Button btnOw2 = findViewById(R.id.btnRusOW2);
        btnOw2.setOnClickListener(onClickListener);

        Button btnOw3 = findViewById(R.id.btnRusOW3);
        btnOw3.setOnClickListener(onClickListener);

        Button btnPerfect = findViewById(R.id.btnRusPERFECT);
        btnPerfect.setOnClickListener(onClickListener);

        Button btnRevenge = findViewById(R.id.btnRusREVENGE);
        btnRevenge.setOnClickListener(onClickListener);

        Button btnRunaway = findViewById(R.id.btnRusRUNAWAY);
        btnRunaway.setOnClickListener(onClickListener);

        Button btnStupid = findViewById(R.id.btnRusSTUPID);
        btnStupid.setOnClickListener(onClickListener);

        Button btnTakeCover = findViewById(R.id.btnRusTAKECOVER);
        btnTakeCover.setOnClickListener(onClickListener);

        Button btnTraitor = findViewById(R.id.btnRusTRAITOR);
        btnTraitor.setOnClickListener(onClickListener);

        Button btnUhoh = findViewById(R.id.btnRusUHOH);
        btnUhoh.setOnClickListener(onClickListener);

        Button btnVictory = findViewById(R.id.btnRusVICTORY);
        btnVictory.setOnClickListener(onClickListener);

        Button btnWatchthis = findViewById(R.id.btnRusWATCHTHIS);
        btnWatchthis.setOnClickListener(onClickListener);

        Button btnWhatthe = findViewById(R.id.btnRusWHATTHE);
        btnWhatthe.setOnClickListener(onClickListener);

        Button btnYessir = findViewById(R.id.btnRusYESSIR);
        btnYessir.setOnClickListener(onClickListener);

        Button btnYoullregretthat = findViewById(R.id.btnRusYOULLREGRETTHAT);
        btnYoullregretthat.setOnClickListener(onClickListener);



    }


    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnRusAmazing:
                    playSound(rusamazing);
                    break;
                case R.id.btnRusBoring:
                    playSound(rusboring);
                    break;
                case R.id.btnRusBrilliant:
                    playSound(rusbrilliant);
                    break;
                case R.id.btnRusBummer:
                    playSound(rusbummer);
                    break;
                case R.id.btnRusBungee:
                    playSound(rusbungle);
                    break;
                case R.id.btnRusByebye:
                    playSound(rusbyebye);
                    break;
                case R.id.btnRusCollect:
                    playSound(ruscollect);
                    break;
                case R.id.btnRusComeonthen:
                    playSound(ruscomeonthen);
                    break;
                case R.id.btnRusCoward:
                    playSound(ruscoward);
                    break;
                case R.id.btnRusDRAGONPUNCH:
                    playSound(rusdragonpunch);
                    break;
                case R.id.btnRusDROP:
                    playSound(rusdrop);
                    break;
                case R.id.btnRusEXCELLENT:
                    playSound(rusexellent);
                    break;
                case R.id.btnRusFATALITY:
                    playSound(rusfatality);
                    break;
                case R.id.btnRusFIRE:
                    playSound(rusfire);
                    break;
                case R.id.btnRusFIREBALL:
                    playSound(rusfireball);
                    break;
                case R.id.btnRusFIRSTBLOOD:
                    playSound(rusfirstblood);
                    break;
                case R.id.btnRusFLAWLESS:
                    playSound(rusflawless);
                    break;
                case R.id.btnRusGOAWAY:
                    playSound(rusgoaway);
                    break;
                case R.id.btnRusHELLO:
                    playSound(rushello);
                    break;
                case R.id.btnRusHURRY:
                    playSound(rushurry);
                    break;
                case R.id.btnRusILLGETYOU:
                    playSound(rusillgetyou);
                    break;
                case R.id.btnRusGRENADE:
                    playSound(rusgrenade);
                    break;
                case R.id.btnRusINCOMING:
                    playSound(rusincoming);
                    break;
                case R.id.btnRusJUMP1:
                    playSound(rusjump1);
                    break;
                case R.id.btnRusJUMP2:
                    playSound(rusjump2);
                    break;
                case R.id.btnRusJUSTYOUWAIT:
                    playSound(rusjustyouwait);
                    break;
                case R.id.btnRusKAMIKAZE:
                    playSound(ruskamikaze);
                    break;
                case R.id.btnRusLAUGH:
                    playSound(ruslaugh);
                    break;
                case R.id.btnRusLEAVEMEALONE:
                    playSound(rusleavemealone);
                    break;
                case R.id.btnRusMISSED:
                    playSound(rusmissed);
                    break;
                case R.id.btnRusNOOO:
                    playSound(rusnooo);
                    break;
                case R.id.btnRusOHDEAR:
                    playSound(rusohdear);
                    break;
                case R.id.btnRusOINUTTER:
                    playSound(rusgrenade);
                    break;
                case R.id.btnRusOOFF1:
                    playSound(rusooff1);
                    break;
                case R.id.btnRusOOFF2:
                    playSound(rusooff2);
                    break;
                case R.id.btnRusOOFF3:
                    playSound(rusooff3);
                    break;
                case R.id.btnRusOOPS:
                    playSound(rusoops);
                    break;
                case R.id.btnRusORDERS:
                    playSound(rusorders);
                    break;
                case R.id.btnRusOUCH:
                    playSound(rusouch);
                    break;
                case R.id.btnRusOW1:
                    playSound(rusow1);
                    break;
                case R.id.btnRusOW2:
                    playSound(rusow2);
                    break;
                case R.id.btnRusOW3:
                    playSound(rusow3);
                    break;
                case R.id.btnRusPERFECT:
                    playSound(rusperfect);
                    break;
                case R.id.btnRusREVENGE:
                    playSound(rusrevenge);
                    break;
                case R.id.btnRusRUNAWAY:
                    playSound(rusrunaway);
                    break;
                case R.id.btnRusSTUPID:
                    playSound(russtupid);
                    break;
                case R.id.btnRusTAKECOVER:
                    playSound(rustakecover);
                    break;
                case R.id.btnRusTRAITOR:
                    playSound(rustraitor);
                    break;
                case R.id.btnRusUHOH:
                    playSound(rusuhoh);
                    break;
                case R.id.btnRusVICTORY:
                    playSound(rusvictoty);
                    break;
                case R.id.btnRusWATCHTHIS:
                    playSound(ruswatchthis);
                    break;
                case R.id.btnRusWHATTHE:
                    playSound(ruswhatthe);
                    break;
                case R.id.btnRusYESSIR:
                    playSound(rusyessir);
                    break;
                case R.id.btnRusYOULLREGRETTHAT:
                    playSound(rusyoullregetthat);
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

        rusamazing = loadSound("rusamazing.wav");
        rusboring = loadSound("rusboring.wav");
        rusbrilliant = loadSound("rusbrilliant.wav");
        rusbummer = loadSound("rusbummer.wav");
        rusbungle = loadSound("rusbungee.wav");
        rusbyebye = loadSound("rusbyebye.wav");
        ruscollect = loadSound("ruscollect.wav");
        ruscomeonthen = loadSound("ruscomeonthen.wav");
        ruscoward = loadSound("ruscoward.wav");
        rusdragonpunch = loadSound("rusdragonpunch.wav");
        rusdrop = loadSound("rusdrop.wav");
        rusexellent = loadSound("rusexcellent.wav");
        rusfatality = loadSound("rusfatality.wav");
        rusfire = loadSound("rusfire.wav");
        rusfireball = loadSound("rusfireball.wav");
        rusfirstblood = loadSound("rusfirstblood.wav");
        rusflawless = loadSound("rusflawless.wav");
        rusgoaway = loadSound("rusgoaway.wav");
        rusgrenade = loadSound("rusgrenade.wav");
        rushello = loadSound("rushello.wav");
        rushurry = loadSound("rushurry.wav");
        rusincoming = loadSound("rusincoming.wav");
        rusjump1 = loadSound("rusjump1.wav");
        rusjump2 = loadSound("rusjump2.wav");
        rusjustyouwait = loadSound("rusjustyouwait.wav");
        ruslaugh = loadSound("ruslaugh.wav");
        rusleavemealone = loadSound("rusleavemealone.wav");
        rusmissed = loadSound("rusmissed.wav");
        rusnooo = loadSound("rusnooo.wav");
        rusohdear = loadSound("rusohdeer.wav");
        rusoinutter = loadSound("rusoinutter.wav");
        rusooff1 = loadSound("rusoof1.wav");
        rusooff2 = loadSound("rusoof2.wav");
        rusooff3 = loadSound("rusoof3.wav");
        rusoops = loadSound("rusoops.wav");
        rusorders = loadSound("rusorders.wav");
        rusouch = loadSound("rusouch.wav");
        rusow1 = loadSound("rusow1.wav");
        ruskamikaze = loadSound("ruskamikaze.wav");
        rusow2 = loadSound("rusow2.wav");
        rusow3 = loadSound("rusow3.wav");
        rusperfect = loadSound("rusperfect.wav");
        rusrevenge = loadSound("rusrevenge.wav");
        rusrunaway = loadSound("rusrunaway.wav");
        russtupid = loadSound("russtupid.wav");
        rustakecover = loadSound("rustakeover.wav");
        rustraitor = loadSound("rustraitor.wav");
        rusuhoh = loadSound("rusuhoh.wav");
        rusvictoty = loadSound("rusvictory.wav");
        ruswatchthis = loadSound("ruswatchthis.wav");
        ruswhatthe = loadSound("ruswhatthe.wav");
        rusyessir = loadSound("rusyessir.wav");
        rusyoullregetthat = loadSound("rusyoullregretthat.wav");
        rusillgetyou = loadSound("rusillgetyou.wav");
    }
}

