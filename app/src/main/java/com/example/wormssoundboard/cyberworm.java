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

public class cyberworm extends AppCompatActivity {
    public int cybamazing;
    public SoundPool mcSoundPool;
    public AssetManager mcAssetManager;
    public int mcStreamID;
    public int cyberboring;
    private int cyberbrilliant;
    private int cyberbummer;
    private int cyberbungle;
    private int cyberbyebye;
    private int cybercollect;
    private int cybercomeonthen;
    private int cybercoward;
    private int cyberdragonpunch;
    private int cyberdrop;
    private int cyberexellent;
    private int cyberfatality;
    private int cyberfire;
    private int cyberfireball;
    private int cyberfirstblood;
    private int cyberflawless;
    private int cybergoaway;
    private int cybergrenade;
    private int cyberhello;
    private int cyberhurry;
    private int cyberincoming;
    private int cyberjump1;
    private int cyberjump2;
    private int cyberjustyouwait;
    private int cyberkamikaze;
    private int cyberlaugh;
    private int cyberleavemealone;
    private int cybermissed;
    private int cybernooo;
    private int cyberohdear;
    public int cyberoinutter;
    public int cyberooff1;
    public int cyberooff2;
    public int cyberooff3;
    public int cyberoops;
    public int cyberorders;
    public int cyberouch;
    public int cyberow1;
    public int cyberow2;
    public int cyberow3;
    public int cyberperfect;
    public int cyberrevenge;
    public int cyberrunaway;
    public int cyberstupid;
    public int cybertakecover;
    public int cybertraitor;
    public int cyberuhoh;
    public int cybervictoty;
    public int cyberwatchthis;
    public int cyberwhatthe;
    public int cyberyessir;
    public int cyberyoullregetthat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cyberworm);
        Button btnAmazing = findViewById(R.id.btnCyberAmazing);
        btnAmazing.setOnClickListener(onClickListener);

        Button btnBoring = findViewById(R.id.btnCyberBoring);
        btnBoring.setOnClickListener(onClickListener);

        Button btnBrilliant = findViewById(R.id.btnCyberBrilliant);
        btnBrilliant.setOnClickListener(onClickListener);

        Button btnBummer = findViewById(R.id.btnCyberBummer);
        btnBummer.setOnClickListener(onClickListener);

        Button btnBungee = findViewById(R.id.btnCyberBungee);
        btnBungee.setOnClickListener(onClickListener);

        Button btnByebye= findViewById(R.id.btnCyberByebye);
        btnByebye.setOnClickListener(onClickListener);

        Button btnCollect = findViewById(R.id.btnCyberCollect);
        btnCollect.setOnClickListener(onClickListener);

        Button btnComeonthen = findViewById(R.id.btnCyberComeonthen);
        btnComeonthen.setOnClickListener(onClickListener);

        Button btnCoward = findViewById(R.id.btnCyberCoward);
        btnCoward.setOnClickListener(onClickListener);

        Button btnDroagonpunch = findViewById(R.id.btnCyberDRAGONPUNCH);
        btnDroagonpunch.setOnClickListener(onClickListener);

        Button btnDrop = findViewById(R.id.btnCyberDROP);
        btnDrop.setOnClickListener(onClickListener);

        Button btnExcellent = findViewById(R.id.btnCyberEXCELLENT);
        btnExcellent.setOnClickListener(onClickListener);

        Button btnFatality = findViewById(R.id.btnCyberFATALITY);
        btnFatality.setOnClickListener(onClickListener);

        Button btnFire = findViewById(R.id.btnCyberFIRE);
        btnFire.setOnClickListener(onClickListener);

        Button btnFireball = findViewById(R.id.btnCyberFIREBALL);
        btnFireball.setOnClickListener(onClickListener);

        Button btnFirstblood = findViewById(R.id.btnCyberFIRSTBLOOD);
        btnFirstblood.setOnClickListener(onClickListener);

        Button btnFlawLess = findViewById(R.id.btnCyberFLAWLESS);
        btnFlawLess.setOnClickListener(onClickListener);

        Button btnGoaway = findViewById(R.id.btnCyberGOAWAY);
        btnGoaway.setOnClickListener(onClickListener);

        Button btnGrenade = findViewById(R.id.btnCyberGRENADE);
        btnGrenade.setOnClickListener(onClickListener);

        Button btnHello = findViewById(R.id.btnCyberHELLO);
        btnHello.setOnClickListener(onClickListener);

        Button btnHurry = findViewById(R.id.btnCyberHURRY);
        btnHurry.setOnClickListener(onClickListener);

        Button btnIllegetyou = findViewById(R.id.btnCyberILLGETYOU);
        btnIllegetyou.setOnClickListener(onClickListener);

        Button btnIncoming = findViewById(R.id.btnCyberINCOMING);
        btnIncoming.setOnClickListener(onClickListener);

        Button btnJump1 = findViewById(R.id.btnCyberJUMP1);
        btnJump1.setOnClickListener(onClickListener);

        Button btnJump2 = findViewById(R.id.btnCyberJUMP2);
        btnJump2.setOnClickListener(onClickListener);

        Button btnJustyouwait = findViewById(R.id.btnCyberJUSTYOUWAIT);
        btnJustyouwait.setOnClickListener(onClickListener);

        Button btnKamikaze = findViewById(R.id.btnCyberKAMIKAZE);
        btnKamikaze.setOnClickListener(onClickListener);

        Button btnLaugh = findViewById(R.id.btnCyberLAUGH);
        btnLaugh.setOnClickListener(onClickListener);

        Button btnLeavemealone = findViewById(R.id.btnCyberLEAVEMEALONE);
        btnLeavemealone.setOnClickListener(onClickListener);

        Button btnMissed = findViewById(R.id.btnCyberMISSED);
        btnMissed.setOnClickListener(onClickListener);

        Button btnNooo = findViewById(R.id.btnCyberNOOO);
        btnNooo.setOnClickListener(onClickListener);

        Button btnOhdear = findViewById(R.id.btnCyberOHDEAR);
        btnOhdear.setOnClickListener(onClickListener);

        Button btnOinutter = findViewById(R.id.btnCyberOINUTTER);
        btnOinutter.setOnClickListener(onClickListener);

        Button btnOoff1 = findViewById(R.id.btnCyberOOFF1);
        btnOoff1.setOnClickListener(onClickListener);

        Button btnOoff2 = findViewById(R.id.btnCyberOOFF2);
        btnOoff2.setOnClickListener(onClickListener);

        Button btnOoff3 = findViewById(R.id.btnCyberOOFF3);
        btnOoff3.setOnClickListener(onClickListener);

        Button btnOops = findViewById(R.id.btnCyberOOPS);
        btnOops.setOnClickListener(onClickListener);

        Button btnOrders = findViewById(R.id.btnCyberORDERS);
        btnOrders.setOnClickListener(onClickListener);

        Button btnOuch = findViewById(R.id.btnCyberOUCH);
        btnOuch.setOnClickListener(onClickListener);

        Button btnOw1 = findViewById(R.id.btnCyberOW1);
        btnOw1.setOnClickListener(onClickListener);

        Button btnOw2 = findViewById(R.id.btnCyberOW2);
        btnOw2.setOnClickListener(onClickListener);

        Button btnOw3 = findViewById(R.id.btnCyberOW3);
        btnOw3.setOnClickListener(onClickListener);

        Button btnPerfect = findViewById(R.id.btnCyberPERFECT);
        btnPerfect.setOnClickListener(onClickListener);

        Button btnRevenge = findViewById(R.id.btnCyberREVENGE);
        btnRevenge.setOnClickListener(onClickListener);

        Button btnRunaway = findViewById(R.id.btnCyberRUNAWAY);
        btnRunaway.setOnClickListener(onClickListener);

        Button btnStupid = findViewById(R.id.btnCyberSTUPID);
        btnStupid.setOnClickListener(onClickListener);

        Button btnTakeCover = findViewById(R.id.btnCyberTAKECOVER);
        btnTakeCover.setOnClickListener(onClickListener);

        Button btnTraitor = findViewById(R.id.btnCyberTRAITOR);
        btnTraitor.setOnClickListener(onClickListener);

        Button btnUhoh = findViewById(R.id.btnCyberUHOH);
        btnUhoh.setOnClickListener(onClickListener);

        Button btnVictory = findViewById(R.id.btnCyberVICTORY);
        btnVictory.setOnClickListener(onClickListener);

        Button btnWatchthis = findViewById(R.id.btnCyberWATCHTHIS);
        btnWatchthis.setOnClickListener(onClickListener);

        Button btnWhatthe = findViewById(R.id.btnCyberWHATTHE);
        btnWhatthe.setOnClickListener(onClickListener);


        Button btnYessir = findViewById(R.id.btnCyberYESSIR);
        btnYessir.setOnClickListener(onClickListener);

        Button btnYoullregretthat = findViewById(R.id.btnCyberYOULLREGRETTHAT);
        btnYoullregretthat.setOnClickListener(onClickListener);

    }


    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnCyberAmazing:
                    playSound(cybamazing);
                    break;
                case R.id.btnCyberBoring:
                    playSound(cyberboring);
                    break;
                case R.id.btnCyberBrilliant:
                    playSound(cyberbrilliant);
                    break;
                case R.id.btnCyberBummer:
                    playSound(cyberbummer);
                    break;
                case R.id.btnCyberBungee:
                    playSound(cyberbungle);
                    break;
                case R.id.btnCyberByebye:
                    playSound(cyberbyebye);
                    break;
                case R.id.btnCyberCollect:
                    playSound(cybercollect);
                    break;
                case R.id.btnCyberComeonthen:
                    playSound(cybercomeonthen);
                    break;
                case R.id.btnCyberCoward:
                    playSound(cybercoward);
                    break;
                case R.id.btnCyberDRAGONPUNCH:
                    playSound(cyberdragonpunch);
                    break;
                case R.id.btnCyberDROP:
                    playSound(cyberdrop);
                    break;
                case R.id.btnCyberEXCELLENT:
                    playSound(cyberexellent);
                    break;
                case R.id.btnCyberFATALITY:
                    playSound(cyberfatality);
                    break;
                case R.id.btnCyberFIRE:
                    playSound(cyberfire);
                    break;
                case R.id.btnCyberFIREBALL:
                    playSound(cyberfireball);
                    break;
                case R.id.btnCyberFIRSTBLOOD:
                    playSound(cyberfirstblood);
                    break;
                case R.id.btnCyberFLAWLESS:
                    playSound(cyberflawless);
                    break;
                case R.id.btnCyberGOAWAY:
                    playSound(cybergoaway);
                    break;
                case R.id.btnCyberHELLO:
                    playSound(cyberhello);
                    break;
                case R.id.btnCyberHURRY:
                    playSound(cyberhurry);
                    break;
                case R.id.btnCyberGRENADE:
                    playSound(cybergrenade);
                    break;
                case R.id.btnCyberINCOMING:
                    playSound(cyberincoming);
                    break;
                case R.id.btnCyberJUMP1:
                    playSound(cyberjump1);
                    break;
                case R.id.btnCyberJUMP2:
                    playSound(cyberjump2);
                    break;
                case R.id.btnCyberJUSTYOUWAIT:
                    playSound(cyberjustyouwait);
                    break;
                case R.id.btnCyberKAMIKAZE:
                    playSound(cyberkamikaze);
                    break;
                case R.id.btnCyberLAUGH:
                    playSound(cyberlaugh);
                    break;
                case R.id.btnCyberLEAVEMEALONE:
                    playSound(cyberleavemealone);
                    break;
                case R.id.btnCyberMISSED:
                    playSound(cybermissed);
                    break;
                case R.id.btnCyberNOOO:
                    playSound(cybernooo);
                    break;
                case R.id.btnCyberOHDEAR:
                    playSound(cyberohdear);
                    break;
                case R.id.btnCyberOINUTTER:
                    playSound(cybergrenade);
                    break;
                case R.id.btnCyberOOFF1:
                    playSound(cyberooff1);
                    break;
                case R.id.btnCyberOOFF2:
                    playSound(cyberooff2);
                    break;
                case R.id.btnCyberOOFF3:
                    playSound(cyberooff3);
                    break;
                case R.id.btnCyberOOPS:
                    playSound(cyberoops);
                    break;
                case R.id.btnCyberORDERS:
                    playSound(cyberorders);
                    break;
                case R.id.btnCyberOUCH:
                    playSound(cyberouch);
                    break;
                case R.id.btnCyberOW1:
                    playSound(cyberow1);
                    break;
                case R.id.btnCyberOW2:
                    playSound(cyberow2);
                    break;
                case R.id.btnCyberOW3:
                    playSound(cyberow3);
                    break;
                case R.id.btnCyberPERFECT:
                    playSound(cyberperfect);
                    break;
                case R.id.btnCyberREVENGE:
                    playSound(cyberrevenge);
                    break;
                case R.id.btnCyberRUNAWAY:
                    playSound(cyberrunaway);
                    break;
                case R.id.btnCyberSTUPID:
                    playSound(cyberstupid);
                    break;
                case R.id.btnCyberTAKECOVER:
                    playSound(cybertakecover);
                    break;
                case R.id.btnCyberTRAITOR:
                    playSound(cybertraitor);
                    break;
                case R.id.btnCyberUHOH:
                    playSound(cyberuhoh);
                    break;
                case R.id.btnCyberVICTORY:
                    playSound(cybervictoty);
                    break;
                case R.id.btnCyberWATCHTHIS:
                    playSound(cyberwatchthis);
                    break;
                case R.id.btnCyberWHATTHE:
                    playSound(cyberwhatthe);
                    break;
                case R.id.btnCyberYESSIR:
                    playSound(cyberyessir);
                    break;
                case R.id.btnCyberYOULLREGRETTHAT:
                    playSound(cyberyoullregetthat);
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
        mcSoundPool = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
    }
    @SuppressWarnings("deprecation")
    public void createOldSoundPool() {
        mcSoundPool = new SoundPool(3, AudioManager.STREAM_MUSIC, 5);
    }
    public int playSound(int sound) {
        if (sound > 0) mcStreamID = mcSoundPool.play(sound, 1, 1, 1, 0, 1);
        return mcStreamID;
    }

    private int loadSound(String fileName) {
        AssetFileDescriptor afd;
        try {
            afd = mcAssetManager.openFd(fileName);
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), "Не могу загрузить файл " + fileName,
                    Toast.LENGTH_SHORT).show();
            return -1;
        }
        return mcSoundPool.load(afd, 1);
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
        mcAssetManager = getAssets();

        cybamazing = loadSound("Cyberamazing.wav");
        cyberboring = loadSound("Cyberboring.wav");
        cyberbrilliant = loadSound("Cyberbrilliant.wav");
        cyberbummer = loadSound("Cyberbummer.wav");
        cyberbungle = loadSound("Cyberbungee.wav");
        cyberbyebye = loadSound("Cyberbyebye.wav");
        cybercollect = loadSound("Cybercollect.wav");
        cybercomeonthen = loadSound("Cybercomeonthen.wav");
        cybercoward = loadSound("Cybercoward.wav");
        cyberdragonpunch = loadSound("Cyberdragonpunch.wav");
        cyberdrop = loadSound("Cyberdrop.wav");
        cyberexellent = loadSound("Cyberexcellent.wav");
        cyberfatality = loadSound("Cyberfatality.wav");
        cyberfire = loadSound("Cyberfire.wav");
        cyberfireball = loadSound("Cyberfireball.wav");
        cyberfirstblood = loadSound("Cyberfirstblood.wav");
        cyberflawless = loadSound("Cyberflawless.wav");
        cybergoaway = loadSound("Cybergoaway.wav");
        cybergrenade = loadSound("Cybergrenade.wav");
        cyberhello = loadSound("Cyberhello.wav");
        cyberhurry = loadSound("Cyberhurry.wav");
        cyberincoming = loadSound("Cyberincoming.wav");
        cyberjump1 = loadSound("Cyberjump1.wav");
        cyberjump2 = loadSound("Cyberjump2.wav");
        cyberjustyouwait = loadSound("Cyberjustyouwait.wav");
        cyberlaugh = loadSound("Cyberlaugh.wav");
        cyberleavemealone = loadSound("Cyberleavemealone.wav");
        cybermissed = loadSound("Cybermissed.wav");
        cybernooo = loadSound("Cybernooo.wav");
        cyberohdear = loadSound("Cyberohdear.wav");
        cyberoinutter = loadSound("Cyberoinutter.wav");
        cyberooff1 = loadSound("Cyberooff1.wav");
        cyberooff2 = loadSound("Cyberooff2.wav");
        cyberooff3 = loadSound("Cyberooff3.wav");
        cyberoops = loadSound("Cyberoops.wav");
        cyberorders = loadSound("Cyberorders.wav");
        cyberouch = loadSound("Cyberouch.wav");
        cyberow1 = loadSound("Cyberow1.wav");
        cyberkamikaze = loadSound("Cyberkamikaze.wav");
        cyberow2 = loadSound("Cyberow2.wav");
        cyberow3 = loadSound("Cyberow3.wav");
        cyberperfect = loadSound("Cyberperfect.wav");
        cyberrevenge = loadSound("Cyberrevenge.wav");
        cyberrunaway = loadSound("Cyberrunaway.wav");
        cyberstupid = loadSound("Cyberstupid.wav");
        cybertakecover = loadSound("Cybertakecover.wav");
        cybertraitor = loadSound("Cybertraitor.wav");
        cyberuhoh = loadSound("Cyberuh-oh.wav");
        cybervictoty = loadSound("Cybervictory.wav");
        cyberwatchthis = loadSound("Cyberwatchthis.wav");
        cyberwhatthe = loadSound("Cyberwhatthe.wav");
        cyberyessir = loadSound("Cyberyessir.wav");
        cyberyoullregetthat = loadSound("Cyberyoullregretthat.wav");

    }
}