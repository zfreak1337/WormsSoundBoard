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

public class italianworm extends AppCompatActivity {

    public SoundPool mSoundPool;
    public AssetManager mAssetManager;
    public int mStreamID;
    public int itaamazing;
    public int itaboring;
    private int itabrilliant;
    private int itabummer;
    private int itabungle;
    private int itabyebye;
    private int itacollect;
    private int itacomeonthen;
    private int itacoward;
    private int itadragonpunch;
    private int itadrop;
    private int itaexellent;
    private int itafatality;
    private int itafire;
    private int itafireball;
    private int itafirstblood;
    private int itaflawless;
    private int itagoaway;
    private int itagrenade;
    private int itahello;
    private int itahurry;
    private int itaillgetyou;
    private int itaincoming;
    private int itajump1;
    private int itajump2;
    private int itajustyouwait;
    private int itakamikaze;
    private int italaugh;
    private int italeavemealone;
    private int itamissed;
    private int itanooo;
    private int itaohdear;
    public int itaoinutter;
    public int itaooff1;
    public int itaooff2;
    public int itaooff3;
    public int itaoops;
    public int itaorders;
    public int itaouch;
    public int itaow1;
    public int itaow2;
    public int itaow3;
    public int itaperfect;
    public int itarevenge;
    public int itarunaway;
    public int itastupid;
    public int itatakecover;
    public int itatraitor;
    public int itauhoh;
    public int itavictoty;
    public int itawatchthis;
    public int itawhatthe;
    public int itawobble;
    public int itayessir;
    public int itayoullregetthat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italianworm);
        Button btnAmazing = findViewById(R.id.btnItaAmazing);
        btnAmazing.setOnClickListener(onClickListener);

        Button btnBoring = findViewById(R.id.btnItaBoring);
        btnBoring.setOnClickListener(onClickListener);

        Button btnBrilliant = findViewById(R.id.btnItaBrilliant);
        btnBrilliant.setOnClickListener(onClickListener);

        Button btnBummer = findViewById(R.id.btnItaBummer);
        btnBummer.setOnClickListener(onClickListener);

        Button btnBungee = findViewById(R.id.btnItaBungee);
        btnBungee.setOnClickListener(onClickListener);

        Button btnByebye= findViewById(R.id.btnItaByebye);
        btnByebye.setOnClickListener(onClickListener);

        Button btnCollect = findViewById(R.id.btnItaCollect);
        btnCollect.setOnClickListener(onClickListener);

        Button btnComeonthen = findViewById(R.id.btnItaComeonthen);
        btnComeonthen.setOnClickListener(onClickListener);

        Button btnCoward = findViewById(R.id.btnItaCoward);
        btnCoward.setOnClickListener(onClickListener);

        Button btnDroagonpunch = findViewById(R.id.btnItaDRAGONPUNCH);
        btnDroagonpunch.setOnClickListener(onClickListener);

        Button btnDrop = findViewById(R.id.btnItaDROP);
        btnDrop.setOnClickListener(onClickListener);

        Button btnExcellent = findViewById(R.id.btnItaEXCELLENT);
        btnExcellent.setOnClickListener(onClickListener);

        Button btnFatality = findViewById(R.id.btnItaFATALITY);
        btnFatality.setOnClickListener(onClickListener);

        Button btnFire = findViewById(R.id.btnItaFIRE);
        btnFire.setOnClickListener(onClickListener);

        Button btnFireball = findViewById(R.id.btnItaFIREBALL);
        btnFireball.setOnClickListener(onClickListener);

        Button btnFirstblood = findViewById(R.id.btnItaFIRSTBLOOD);
        btnFirstblood.setOnClickListener(onClickListener);

        Button btnFlawLess = findViewById(R.id.btnItaFLAWLESS);
        btnFlawLess.setOnClickListener(onClickListener);

        Button btnGoaway = findViewById(R.id.btnItaGOAWAY);
        btnGoaway.setOnClickListener(onClickListener);

        Button btnGrenade = findViewById(R.id.btnItaGRENADE);
        btnGrenade.setOnClickListener(onClickListener);

        Button btnHello = findViewById(R.id.btnItaHELLO);
        btnHello.setOnClickListener(onClickListener);

        Button btnHurry = findViewById(R.id.btnItaHURRY);
        btnHurry.setOnClickListener(onClickListener);

        Button btnIllegetyou = findViewById(R.id.btnItaILLGETYOU);
        btnIllegetyou.setOnClickListener(onClickListener);

        Button btnIncoming = findViewById(R.id.btnItaINCOMING);
        btnIncoming.setOnClickListener(onClickListener);

        Button btnJump1 = findViewById(R.id.btnItaJUMP1);
        btnJump1.setOnClickListener(onClickListener);

        Button btnJump2 = findViewById(R.id.btnItaJUMP2);
        btnJump2.setOnClickListener(onClickListener);

        Button btnJustyouwait = findViewById(R.id.btnItaJUSTYOUWAIT);
        btnJustyouwait.setOnClickListener(onClickListener);

        Button btnKamikaze = findViewById(R.id.btnItaKAMIKAZE);
        btnKamikaze.setOnClickListener(onClickListener);

        Button btnLaugh = findViewById(R.id.btnItaLAUGH);
        btnLaugh.setOnClickListener(onClickListener);

        Button btnLeavemealone = findViewById(R.id.btnItaLEAVEMEALONE);
        btnLeavemealone.setOnClickListener(onClickListener);

        Button btnMissed = findViewById(R.id.btnItaMISSED);
        btnMissed.setOnClickListener(onClickListener);

        Button btnNooo = findViewById(R.id.btnItaNOOO);
        btnNooo.setOnClickListener(onClickListener);

        Button btnOhdear = findViewById(R.id.btnItaOHDEAR);
        btnOhdear.setOnClickListener(onClickListener);

        Button btnOinutter = findViewById(R.id.btnItaOINUTTER);
        btnOinutter.setOnClickListener(onClickListener);

        Button btnOoff1 = findViewById(R.id.btnItaOOFF1);
        btnOoff1.setOnClickListener(onClickListener);

        Button btnOoff2 = findViewById(R.id.btnItaOOFF2);
        btnOoff2.setOnClickListener(onClickListener);

        Button btnOoff3 = findViewById(R.id.btnItaOOFF3);
        btnOoff3.setOnClickListener(onClickListener);

        Button btnOops = findViewById(R.id.btnItaOOPS);
        btnOops.setOnClickListener(onClickListener);

        Button btnOrders = findViewById(R.id.btnItaORDERS);
        btnOrders.setOnClickListener(onClickListener);

        Button btnOuch = findViewById(R.id.btnItaOUCH);
        btnOuch.setOnClickListener(onClickListener);

        Button btnOw1 = findViewById(R.id.btnItaOW1);
        btnOw1.setOnClickListener(onClickListener);

        Button btnOw2 = findViewById(R.id.btnItaOW2);
        btnOw2.setOnClickListener(onClickListener);

        Button btnOw3 = findViewById(R.id.btnItaOW3);
        btnOw3.setOnClickListener(onClickListener);

        Button btnPerfect = findViewById(R.id.btnItaPERFECT);
        btnPerfect.setOnClickListener(onClickListener);

        Button btnRevenge = findViewById(R.id.btnItaREVENGE);
        btnRevenge.setOnClickListener(onClickListener);

        Button btnRunaway = findViewById(R.id.btnItaRUNAWAY);
        btnRunaway.setOnClickListener(onClickListener);

        Button btnStupid = findViewById(R.id.btnItaSTUPID);
        btnStupid.setOnClickListener(onClickListener);

        Button btnTakeCover = findViewById(R.id.btnItaTAKECOVER);
        btnTakeCover.setOnClickListener(onClickListener);

        Button btnTraitor = findViewById(R.id.btnItaTRAITOR);
        btnTraitor.setOnClickListener(onClickListener);

        Button btnUhoh = findViewById(R.id.btnItaUHOH);
        btnUhoh.setOnClickListener(onClickListener);

        Button btnVictory = findViewById(R.id.btnItaVICTORY);
        btnVictory.setOnClickListener(onClickListener);

        Button btnWatchthis = findViewById(R.id.btnItaWATCHTHIS);
        btnWatchthis.setOnClickListener(onClickListener);

        Button btnWhatthe = findViewById(R.id.btnItaWHATTHE);
        btnWhatthe.setOnClickListener(onClickListener);

        Button btnWobble = findViewById(R.id.btnItaWOBBLE);
        btnWobble.setOnClickListener(onClickListener);

        Button btnYessir = findViewById(R.id.btnItaYESSIR);
        btnYessir.setOnClickListener(onClickListener);

        Button btnYoullregretthat = findViewById(R.id.btnItaYOULLREGRETTHAT);
        btnYoullregretthat.setOnClickListener(onClickListener);



    }


    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnItaAmazing:
                    playSound(itaamazing);
                    break;
                case R.id.btnItaBoring:
                    playSound(itaboring);
                    break;
                case R.id.btnItaBrilliant:
                    playSound(itabrilliant);
                    break;
                case R.id.btnItaBummer:
                    playSound(itabummer);
                    break;
                case R.id.btnItaBungee:
                    playSound(itabungle);
                    break;
                case R.id.btnItaByebye:
                    playSound(itabyebye);
                    break;
                case R.id.btnItaCollect:
                    playSound(itacollect);
                    break;
                case R.id.btnItaComeonthen:
                    playSound(itacomeonthen);
                    break;
                case R.id.btnItaCoward:
                    playSound(itacoward);
                    break;
                case R.id.btnItaDRAGONPUNCH:
                    playSound(itadragonpunch);
                    break;
                case R.id.btnItaDROP:
                    playSound(itadrop);
                    break;
                case R.id.btnItaEXCELLENT:
                    playSound(itaexellent);
                    break;
                case R.id.btnItaFATALITY:
                    playSound(itafatality);
                    break;
                case R.id.btnItaFIRE:
                    playSound(itafire);
                    break;
                case R.id.btnItaFIREBALL:
                    playSound(itafireball);
                    break;
                case R.id.btnItaFIRSTBLOOD:
                    playSound(itafirstblood);
                    break;
                case R.id.btnItaFLAWLESS:
                    playSound(itaflawless);
                    break;
                case R.id.btnItaGOAWAY:
                    playSound(itagoaway);
                    break;
                case R.id.btnItaHELLO:
                    playSound(itahello);
                    break;
                case R.id.btnItaHURRY:
                    playSound(itahurry);
                    break;
                case R.id.btnItaILLGETYOU:
                    playSound(itaillgetyou);
                    break;
                case R.id.btnItaGRENADE:
                    playSound(itagrenade);
                    break;
                case R.id.btnItaINCOMING:
                    playSound(itaincoming);
                    break;
                case R.id.btnItaJUMP1:
                    playSound(itajump1);
                    break;
                case R.id.btnItaJUMP2:
                    playSound(itajump2);
                    break;
                case R.id.btnItaJUSTYOUWAIT:
                    playSound(itajustyouwait);
                    break;
                case R.id.btnItaKAMIKAZE:
                    playSound(itakamikaze);
                    break;
                case R.id.btnItaLAUGH:
                    playSound(italaugh);
                    break;
                case R.id.btnItaLEAVEMEALONE:
                    playSound(italeavemealone);
                    break;
                case R.id.btnItaMISSED:
                    playSound(itamissed);
                    break;
                case R.id.btnItaNOOO:
                    playSound(itanooo);
                    break;
                case R.id.btnItaOHDEAR:
                    playSound(itaohdear);
                    break;
                case R.id.btnItaOINUTTER:
                    playSound(itagrenade);
                    break;
                case R.id.btnItaOOFF1:
                    playSound(itaooff1);
                    break;
                case R.id.btnItaOOFF2:
                    playSound(itaooff2);
                    break;
                case R.id.btnItaOOFF3:
                    playSound(itaooff3);
                    break;
                case R.id.btnItaOOPS:
                    playSound(itaoops);
                    break;
                case R.id.btnItaORDERS:
                    playSound(itaorders);
                    break;
                case R.id.btnItaOUCH:
                    playSound(itaouch);
                    break;
                case R.id.btnItaOW1:
                    playSound(itaow1);
                    break;
                case R.id.btnItaOW2:
                    playSound(itaow2);
                    break;
                case R.id.btnItaOW3:
                    playSound(itaow3);
                    break;
                case R.id.btnItaPERFECT:
                    playSound(itaperfect);
                    break;
                case R.id.btnItaREVENGE:
                    playSound(itarevenge);
                    break;
                case R.id.btnItaRUNAWAY:
                    playSound(itarunaway);
                    break;
                case R.id.btnItaSTUPID:
                    playSound(itastupid);
                    break;
                case R.id.btnItaTAKECOVER:
                    playSound(itatakecover);
                    break;
                case R.id.btnItaTRAITOR:
                    playSound(itatraitor);
                    break;
                case R.id.btnItaUHOH:
                    playSound(itauhoh);
                    break;
                case R.id.btnItaVICTORY:
                    playSound(itavictoty);
                    break;
                case R.id.btnItaWATCHTHIS:
                    playSound(itawatchthis);
                    break;
                case R.id.btnItaWHATTHE:
                    playSound(itawhatthe);
                    break;
                case R.id.btnItaWOBBLE:
                    playSound(itawobble);
                    break;
                case R.id.btnItaYESSIR:
                    playSound(itayessir);
                    break;
                case R.id.btnItaYOULLREGRETTHAT:
                    playSound(itayoullregetthat);
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

        itaamazing = loadSound("itaAMAZING.WAV");
        itaboring = loadSound("itaBORING.WAV");
        itabrilliant = loadSound("itaBRILLIANT.WAV");
        itabummer = loadSound("itaBUMMER.WAV");
        itabungle = loadSound("itaBUNGEE.WAV");
        itabyebye = loadSound("itaBYEBYE.WAV");
        itacollect = loadSound("itaCOLLECT.WAV");
        itacomeonthen = loadSound("itaCOMEONTHEN.WAV");
        itacoward = loadSound("itaCOWARD.WAV");
        itadragonpunch = loadSound("itaDRAGONPUNCH.WAV");
        itadrop = loadSound("itaDROP.WAV");
        itaexellent = loadSound("itaEXCELLENT.WAV");
        itafatality = loadSound("itaFATALITY.WAV");
        itafire = loadSound("itaFIRE.WAV");
        itafireball = loadSound("itaFIREBALL.WAV");
        itafirstblood = loadSound("itaFIRSTBLOOD.WAV");
        itaflawless = loadSound("itaFLAWLESS.WAV");
        itagoaway = loadSound("itaGOAWAY.WAV");
        itagrenade = loadSound("itaGRENADE.WAV");
        itahello = loadSound("itaHELLO.WAV");
        itahurry = loadSound("itaHURRY.WAV");
        itaincoming = loadSound("itaINCOMING.WAV");
        itajump1 = loadSound("itaJUMP1.WAV");
        itajump2 = loadSound("itaJUMP2.WAV");
        itajustyouwait = loadSound("itaJUSTYOUWAIT.WAV");
        italaugh = loadSound("itaLAUGH.WAV");
        italeavemealone = loadSound("itaLEAVEMEALONE.WAV");
        itamissed = loadSound("itaMISSED.WAV");
        itanooo = loadSound("itaNOOO.WAV");
        itaohdear = loadSound("itaOHDEAR.WAV");
        itaoinutter = loadSound("itaOINUTTER.WAV");
        itaooff1 = loadSound("itaOOFF1.WAV");
        itaooff2 = loadSound("itaOOFF2.WAV");
        itaooff3 = loadSound("itaOOFF3.WAV");
        itaoops = loadSound("itaOOPS.WAV");
        itaorders = loadSound("itaORDERS.WAV");
        itaouch = loadSound("itaOUCH.WAV");
        itaow1 = loadSound("itaOW1.WAV");
        itakamikaze = loadSound("itaKAMIKAZE.WAV");
        itaow2 = loadSound("itaOW2.WAV");
        itaow3 = loadSound("itaOW3.WAV");
        itaperfect = loadSound("itaPERFECT.WAV");
        itarevenge = loadSound("itaREVENGE.WAV");
        itarunaway = loadSound("itaRUNAWAY.WAV");
        itastupid = loadSound("itaSTUPID.WAV");
        itatakecover = loadSound("itaTAKECOVER.WAV");
        itatraitor = loadSound("itaTRAITOR.WAV");
        itauhoh = loadSound("itaUH-OH.WAV");
        itavictoty = loadSound("itaVICTORY.WAV");
        itawatchthis = loadSound("itaWATCHTHIS.WAV");
        itawhatthe = loadSound("itaWHATTHE.WAV");
        itawobble = loadSound("itaWOBBLE.WAV");
        itayessir = loadSound("itaYESSIR.WAV");
        itayoullregetthat = loadSound("itaYOULLREGRETTHAT.WAV");
        itaillgetyou = loadSound("itaILLGETYOU.WAV");
    }
}