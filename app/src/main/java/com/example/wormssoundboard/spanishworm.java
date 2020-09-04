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

public class spanishworm extends AppCompatActivity {

    public SoundPool mSoundPool;
    public AssetManager mAssetManager;
    public int mStreamID;
    public int spaamazing;
    public int spaboring;
    private int spabrilliant;
    private int spabummer;
    private int spabungle;
    private int spabyebye;
    private int spacollect;
    private int spacomeonthen;
    private int spacoward;
    private int spadragonpunch;
    private int spadrop;
    private int spaexellent;
    private int spafatality;
    private int spafire;
    private int spafireball;
    private int spafirstblood;
    private int spaflawless;
    private int spagoaway;
    private int spagrenade;
    private int spahello;
    private int spahurry;
    private int spaillgetyou;
    private int spaincoming;
    private int spajump1;
    private int spajump2;
    private int spajustyouwait;
    private int spakamikaze;
    private int spalaugh;
    private int spaleavemealone;
    private int spamissed;
    private int spanooo;
    private int spaohdear;
    public int spaoinutter;
    public int spaooff1;
    public int spaooff2;
    public int spaooff3;
    public int spaoops;
    public int spaorders;
    public int spaouch;
    public int spaow1;
    public int spaow2;
    public int spaow3;
    public int spaperfect;
    public int sparevenge;
    public int sparunaway;
    public int spastupid;
    public int spatakecover;
    public int spatraitor;
    public int spauhoh;
    public int spavictoty;
    public int spawatchthis;
    public int spawhatthe;
    public int spawobble;
    public int spayessir;
    public int spayoullregetthat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spanishworm);
        Button btnAmazing = findViewById(R.id.btnSpaAmazing);
        btnAmazing.setOnClickListener(onClickListener);

        Button btnBoring = findViewById(R.id.btnSpaBoring);
        btnBoring.setOnClickListener(onClickListener);

        Button btnBrilliant = findViewById(R.id.btnSpaBrilliant);
        btnBrilliant.setOnClickListener(onClickListener);

        Button btnBummer = findViewById(R.id.btnSpaBummer);
        btnBummer.setOnClickListener(onClickListener);

        Button btnBungee = findViewById(R.id.btnSpaBungee);
        btnBungee.setOnClickListener(onClickListener);

        Button btnByebye= findViewById(R.id.btnSpaByebye);
        btnByebye.setOnClickListener(onClickListener);

        Button btnCollect = findViewById(R.id.btnSpaCollect);
        btnCollect.setOnClickListener(onClickListener);

        Button btnComeonthen = findViewById(R.id.btnSpaComeonthen);
        btnComeonthen.setOnClickListener(onClickListener);

        Button btnCoward = findViewById(R.id.btnSpaCoward);
        btnCoward.setOnClickListener(onClickListener);

        Button btnDroagonpunch = findViewById(R.id.btnSpaDRAGONPUNCH);
        btnDroagonpunch.setOnClickListener(onClickListener);

        Button btnDrop = findViewById(R.id.btnSpaDROP);
        btnDrop.setOnClickListener(onClickListener);

        Button btnExcellent = findViewById(R.id.btnSpaEXCELLENT);
        btnExcellent.setOnClickListener(onClickListener);

        Button btnFatality = findViewById(R.id.btnSpaFATALITY);
        btnFatality.setOnClickListener(onClickListener);

        Button btnFire = findViewById(R.id.btnSpaFIRE);
        btnFire.setOnClickListener(onClickListener);

        Button btnFireball = findViewById(R.id.btnSpaFIREBALL);
        btnFireball.setOnClickListener(onClickListener);

        Button btnFirstblood = findViewById(R.id.btnSpaFIRSTBLOOD);
        btnFirstblood.setOnClickListener(onClickListener);

        Button btnFlawLess = findViewById(R.id.btnSpaFLAWLESS);
        btnFlawLess.setOnClickListener(onClickListener);

        Button btnGoaway = findViewById(R.id.btnSpaGOAWAY);
        btnGoaway.setOnClickListener(onClickListener);

        Button btnGrenade = findViewById(R.id.btnSpaGRENADE);
        btnGrenade.setOnClickListener(onClickListener);

        Button btnHello = findViewById(R.id.btnSpaHELLO);
        btnHello.setOnClickListener(onClickListener);

        Button btnHurry = findViewById(R.id.btnSpaHURRY);
        btnHurry.setOnClickListener(onClickListener);

        Button btnIllegetyou = findViewById(R.id.btnSpaILLGETYOU);
        btnIllegetyou.setOnClickListener(onClickListener);

        Button btnIncoming = findViewById(R.id.btnSpaINCOMING);
        btnIncoming.setOnClickListener(onClickListener);

        Button btnJump1 = findViewById(R.id.btnSpaJUMP1);
        btnJump1.setOnClickListener(onClickListener);

        Button btnJump2 = findViewById(R.id.btnSpaJUMP2);
        btnJump2.setOnClickListener(onClickListener);

        Button btnJustyouwait = findViewById(R.id.btnSpaJUSTYOUWAIT);
        btnJustyouwait.setOnClickListener(onClickListener);

        Button btnKamikaze = findViewById(R.id.btnSpaKAMIKAZE);
        btnKamikaze.setOnClickListener(onClickListener);

        Button btnLaugh = findViewById(R.id.btnSpaLAUGH);
        btnLaugh.setOnClickListener(onClickListener);

        Button btnLeavemealone = findViewById(R.id.btnSpaLEAVEMEALONE);
        btnLeavemealone.setOnClickListener(onClickListener);

        Button btnMissed = findViewById(R.id.btnSpaMISSED);
        btnMissed.setOnClickListener(onClickListener);

        Button btnNooo = findViewById(R.id.btnSpaNOOO);
        btnNooo.setOnClickListener(onClickListener);

        Button btnOhdear = findViewById(R.id.btnSpaOHDEAR);
        btnOhdear.setOnClickListener(onClickListener);

        Button btnOinutter = findViewById(R.id.btnSpaOINUTTER);
        btnOinutter.setOnClickListener(onClickListener);

        Button btnOoff1 = findViewById(R.id.btnSpaOOFF1);
        btnOoff1.setOnClickListener(onClickListener);

        Button btnOoff2 = findViewById(R.id.btnSpaOOFF2);
        btnOoff2.setOnClickListener(onClickListener);

        Button btnOoff3 = findViewById(R.id.btnSpaOOFF3);
        btnOoff3.setOnClickListener(onClickListener);

        Button btnOops = findViewById(R.id.btnSpaOOPS);
        btnOops.setOnClickListener(onClickListener);

        Button btnOrders = findViewById(R.id.btnSpaORDERS);
        btnOrders.setOnClickListener(onClickListener);

        Button btnOuch = findViewById(R.id.btnSpaOUCH);
        btnOuch.setOnClickListener(onClickListener);

        Button btnOw1 = findViewById(R.id.btnSpaOW1);
        btnOw1.setOnClickListener(onClickListener);

        Button btnOw2 = findViewById(R.id.btnSpaOW2);
        btnOw2.setOnClickListener(onClickListener);

        Button btnOw3 = findViewById(R.id.btnSpaOW3);
        btnOw3.setOnClickListener(onClickListener);

        Button btnPerfect = findViewById(R.id.btnSpaPERFECT);
        btnPerfect.setOnClickListener(onClickListener);

        Button btnRevenge = findViewById(R.id.btnSpaREVENGE);
        btnRevenge.setOnClickListener(onClickListener);

        Button btnRunaway = findViewById(R.id.btnSpaRUNAWAY);
        btnRunaway.setOnClickListener(onClickListener);

        Button btnStupid = findViewById(R.id.btnSpaSTUPID);
        btnStupid.setOnClickListener(onClickListener);

        Button btnTakeCover = findViewById(R.id.btnSpaTAKECOVER);
        btnTakeCover.setOnClickListener(onClickListener);

        Button btnTraitor = findViewById(R.id.btnSpaTRAITOR);
        btnTraitor.setOnClickListener(onClickListener);

        Button btnUhoh = findViewById(R.id.btnSpaUHOH);
        btnUhoh.setOnClickListener(onClickListener);

        Button btnVictory = findViewById(R.id.btnSpaVICTORY);
        btnVictory.setOnClickListener(onClickListener);

        Button btnWatchthis = findViewById(R.id.btnSpaWATCHTHIS);
        btnWatchthis.setOnClickListener(onClickListener);

        Button btnWhatthe = findViewById(R.id.btnSpaWHATTHE);
        btnWhatthe.setOnClickListener(onClickListener);

        Button btnWobble = findViewById(R.id.btnSpaWOBBLE);
        btnWobble.setOnClickListener(onClickListener);

        Button btnYessir = findViewById(R.id.btnSpaYESSIR);
        btnYessir.setOnClickListener(onClickListener);

        Button btnYoullregretthat = findViewById(R.id.btnSpaYOULLREGRETTHAT);
        btnYoullregretthat.setOnClickListener(onClickListener);



    }


    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnSpaAmazing:
                    playSound(spaamazing);
                    break;
                case R.id.btnSpaBoring:
                    playSound(spaboring);
                    break;
                case R.id.btnSpaBrilliant:
                    playSound(spabrilliant);
                    break;
                case R.id.btnSpaBummer:
                    playSound(spabummer);
                    break;
                case R.id.btnSpaBungee:
                    playSound(spabungle);
                    break;
                case R.id.btnSpaByebye:
                    playSound(spabyebye);
                    break;
                case R.id.btnSpaCollect:
                    playSound(spacollect);
                    break;
                case R.id.btnSpaComeonthen:
                    playSound(spacomeonthen);
                    break;
                case R.id.btnSpaCoward:
                    playSound(spacoward);
                    break;
                case R.id.btnSpaDRAGONPUNCH:
                    playSound(spadragonpunch);
                    break;
                case R.id.btnSpaDROP:
                    playSound(spadrop);
                    break;
                case R.id.btnSpaEXCELLENT:
                    playSound(spaexellent);
                    break;
                case R.id.btnSpaFATALITY:
                    playSound(spafatality);
                    break;
                case R.id.btnSpaFIRE:
                    playSound(spafire);
                    break;
                case R.id.btnSpaFIREBALL:
                    playSound(spafireball);
                    break;
                case R.id.btnSpaFIRSTBLOOD:
                    playSound(spafirstblood);
                    break;
                case R.id.btnSpaFLAWLESS:
                    playSound(spaflawless);
                    break;
                case R.id.btnSpaGOAWAY:
                    playSound(spagoaway);
                    break;
                case R.id.btnSpaHELLO:
                    playSound(spahello);
                    break;
                case R.id.btnSpaHURRY:
                    playSound(spahurry);
                    break;
                case R.id.btnSpaILLGETYOU:
                    playSound(spaillgetyou);
                    break;
                case R.id.btnSpaGRENADE:
                    playSound(spagrenade);
                    break;
                case R.id.btnSpaINCOMING:
                    playSound(spaincoming);
                    break;
                case R.id.btnSpaJUMP1:
                    playSound(spajump1);
                    break;
                case R.id.btnSpaJUMP2:
                    playSound(spajump2);
                    break;
                case R.id.btnSpaJUSTYOUWAIT:
                    playSound(spajustyouwait);
                    break;
                case R.id.btnSpaKAMIKAZE:
                    playSound(spakamikaze);
                    break;
                case R.id.btnSpaLAUGH:
                    playSound(spalaugh);
                    break;
                case R.id.btnSpaLEAVEMEALONE:
                    playSound(spaleavemealone);
                    break;
                case R.id.btnSpaMISSED:
                    playSound(spamissed);
                    break;
                case R.id.btnSpaNOOO:
                    playSound(spanooo);
                    break;
                case R.id.btnSpaOHDEAR:
                    playSound(spaohdear);
                    break;
                case R.id.btnSpaOINUTTER:
                    playSound(spagrenade);
                    break;
                case R.id.btnSpaOOFF1:
                    playSound(spaooff1);
                    break;
                case R.id.btnSpaOOFF2:
                    playSound(spaooff2);
                    break;
                case R.id.btnSpaOOFF3:
                    playSound(spaooff3);
                    break;
                case R.id.btnSpaOOPS:
                    playSound(spaoops);
                    break;
                case R.id.btnSpaORDERS:
                    playSound(spaorders);
                    break;
                case R.id.btnSpaOUCH:
                    playSound(spaouch);
                    break;
                case R.id.btnSpaOW1:
                    playSound(spaow1);
                    break;
                case R.id.btnSpaOW2:
                    playSound(spaow2);
                    break;
                case R.id.btnSpaOW3:
                    playSound(spaow3);
                    break;
                case R.id.btnSpaPERFECT:
                    playSound(spaperfect);
                    break;
                case R.id.btnSpaREVENGE:
                    playSound(sparevenge);
                    break;
                case R.id.btnSpaRUNAWAY:
                    playSound(sparunaway);
                    break;
                case R.id.btnSpaSTUPID:
                    playSound(spastupid);
                    break;
                case R.id.btnSpaTAKECOVER:
                    playSound(spatakecover);
                    break;
                case R.id.btnSpaTRAITOR:
                    playSound(spatraitor);
                    break;
                case R.id.btnSpaUHOH:
                    playSound(spauhoh);
                    break;
                case R.id.btnSpaVICTORY:
                    playSound(spavictoty);
                    break;
                case R.id.btnSpaWATCHTHIS:
                    playSound(spawatchthis);
                    break;
                case R.id.btnSpaWHATTHE:
                    playSound(spawhatthe);
                    break;
                case R.id.btnSpaWOBBLE:
                    playSound(spawobble);
                    break;
                case R.id.btnSpaYESSIR:
                    playSound(spayessir);
                    break;
                case R.id.btnSpaYOULLREGRETTHAT:
                    playSound(spayoullregetthat);
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

        spaamazing = loadSound("spaAMAZING.WAV");
        spaboring = loadSound("spaBORING.WAV");
        spabrilliant = loadSound("spaBRILLIANT.WAV");
        spabummer = loadSound("spaBUMMER.WAV");
        spabungle = loadSound("spaBUNGEE.WAV");
        spabyebye = loadSound("spaBYEBYE.WAV");
        spacollect = loadSound("spaCOLLECT.WAV");
        spacomeonthen = loadSound("spaCOMEONTHEN.WAV");
        spacoward = loadSound("spaCOWARD.WAV");
        spadragonpunch = loadSound("spaDRAGONPUNCH.WAV");
        spadrop = loadSound("spaDROP.WAV");
        spaexellent = loadSound("spaEXCELLENT.WAV");
        spafatality = loadSound("spaFATALITY.WAV");
        spafire = loadSound("spaFIRE.WAV");
        spafireball = loadSound("spaFIREBALL.WAV");
        spafirstblood = loadSound("spaFIRSTBLOOD.WAV");
        spaflawless = loadSound("spaFLAWLESS.WAV");
        spagoaway = loadSound("spaGOAWAY.WAV");
        spagrenade = loadSound("spaGRENADE.WAV");
        spahello = loadSound("spaHELLO.WAV");
        spahurry = loadSound("spaHURRY.WAV");
        spaincoming = loadSound("spaINCOMING.WAV");
        spajump1 = loadSound("spaJUMP1.WAV");
        spajump2 = loadSound("spaJUMP2.WAV");
        spajustyouwait = loadSound("spaJUSTYOUWAIT.WAV");
        spalaugh = loadSound("spaLAUGH.WAV");
        spaleavemealone = loadSound("spaLEAVEMEALONE.WAV");
        spamissed = loadSound("spaMISSED.WAV");
        spanooo = loadSound("spaNOOO.WAV");
        spaohdear = loadSound("spaOHDEAR.WAV");
        spaoinutter = loadSound("spaOINUTTER.WAV");
        spaooff1 = loadSound("spaOOFF1.WAV");
        spaooff2 = loadSound("spaOOFF2.WAV");
        spaooff3 = loadSound("spaOOFF3.WAV");
        spaoops = loadSound("spaOOPS.WAV");
        spaorders = loadSound("spaORDERS.WAV");
        spaouch = loadSound("spaOUCH.WAV");
        spaow1 = loadSound("spaOW1.WAV");
        spakamikaze = loadSound("spaKAMIKAZE.WAV");
        spaow2 = loadSound("spaOW2.WAV");
        spaow3 = loadSound("spaOW3.WAV");
        spaperfect = loadSound("spaPERFECT.WAV");
        sparevenge = loadSound("spaREVENGE.WAV");
        sparunaway = loadSound("spaRUNAWAY.WAV");
        spastupid = loadSound("spaSTUPID.WAV");
        spatakecover = loadSound("spaTAKECOVER.WAV");
        spatraitor = loadSound("spaTRAITOR.WAV");
        spauhoh = loadSound("spaUH-OH.WAV");
        spavictoty = loadSound("spaVICTORY.WAV");
        spawatchthis = loadSound("spaWATCHTHIS.WAV");
        spawhatthe = loadSound("spaWHATTHE.WAV");
        spawobble = loadSound("spaWOBBLE.WAV");
        spayessir = loadSound("spaYESSIR.WAV");
        spayoullregetthat = loadSound("spaYOULLREGRETTHAT.WAV");
        spaillgetyou = loadSound("spaILLGETYOU.WAV");
    }
}