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

public class engworm extends AppCompatActivity {

    public SoundPool mSoundPool;
    public AssetManager mAssetManager;
    public int mStreamID;
    public int engamazing;
    public int engboring;
    private int engbrilliant;
    private int engbummer;
    private int engbungle;
    private int engbyebye;
    private int engcollect;
    private int engcomeonthen;
    private int engcoward;
    private int engdragonpunch;
    private int engdrop;
    private int engexellent;
    private int engfatality;
    private int engfire;
    private int engfireball;
    private int engfirstblood;
    private int engflawless;
    private int enggoaway;
    private int enggrenade;
    private int enghello;
    private int enghurry;
    private int engillgetyou;
    private int engincoming;
    private int engjump1;
    private int engjump2;
    private int engjustyouwait;
    private int engkamikaze;
    private int englaugh;
    private int engleavemealone;
    private int engmissed;
    private int engnooo;
    private int engohdear;
    public int engoinutter;
    public int engooff1;
    public int engooff2;
    public int engooff3;
    public int engoops;
    public int engorders;
    public int engouch;
    public int engow1;
    public int engow2;
    public int engow3;
    public int engperfect;
    public int engrevenge;
    public int engrunaway;
    public int engstupid;
    public int engtakecover;
    public int engtraitor;
    public int enguhoh;
    public int engvictoty;
    public int engwatchthis;
    public int engwhatthe;
    public int engwobble;
    public int engyessir;
    public int engyoullregetthat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engworm);
        Button btnAmazing = findViewById(R.id.btnEngAmazing);
        btnAmazing.setOnClickListener(onClickListener);

        Button btnBoring = findViewById(R.id.btnEngBoring);
        btnBoring.setOnClickListener(onClickListener);

        Button btnBrilliant = findViewById(R.id.btnEngBrilliant);
        btnBrilliant.setOnClickListener(onClickListener);

        Button btnBummer = findViewById(R.id.btnEngBummer);
        btnBummer.setOnClickListener(onClickListener);

        Button btnBungee = findViewById(R.id.btnEngBungee);
        btnBungee.setOnClickListener(onClickListener);

        Button btnByebye= findViewById(R.id.btnEngByebye);
        btnByebye.setOnClickListener(onClickListener);

        Button btnCollect = findViewById(R.id.btnEngCollect);
        btnCollect.setOnClickListener(onClickListener);

        Button btnComeonthen = findViewById(R.id.btnEngComeonthen);
        btnComeonthen.setOnClickListener(onClickListener);

        Button btnCoward = findViewById(R.id.btnEngCoward);
        btnCoward.setOnClickListener(onClickListener);

        Button btnDroagonpunch = findViewById(R.id.btnEngDRAGONPUNCH);
        btnDroagonpunch.setOnClickListener(onClickListener);

        Button btnDrop = findViewById(R.id.btnEngDROP);
        btnDrop.setOnClickListener(onClickListener);

        Button btnExcellent = findViewById(R.id.btnEngEXCELLENT);
        btnExcellent.setOnClickListener(onClickListener);

        Button btnFatality = findViewById(R.id.btnEngFATALITY);
        btnFatality.setOnClickListener(onClickListener);

        Button btnFire = findViewById(R.id.btnEngFIRE);
        btnFire.setOnClickListener(onClickListener);

        Button btnFireball = findViewById(R.id.btnEngFIREBALL);
        btnFireball.setOnClickListener(onClickListener);

        Button btnFirstblood = findViewById(R.id.btnEngFIRSTBLOOD);
        btnFirstblood.setOnClickListener(onClickListener);

        Button btnFlawLess = findViewById(R.id.btnEngFLAWLESS);
        btnFlawLess.setOnClickListener(onClickListener);

        Button btnGoaway = findViewById(R.id.btnEngGOAWAY);
        btnGoaway.setOnClickListener(onClickListener);

        Button btnGrenade = findViewById(R.id.btnEngGRENADE);
        btnGrenade.setOnClickListener(onClickListener);

        Button btnHello = findViewById(R.id.btnEngHELLO);
        btnHello.setOnClickListener(onClickListener);

        Button btnHurry = findViewById(R.id.btnEngHURRY);
        btnHurry.setOnClickListener(onClickListener);

        Button btnIllegetyou = findViewById(R.id.btnEngILLGETYOU);
        btnIllegetyou.setOnClickListener(onClickListener);

        Button btnIncoming = findViewById(R.id.btnEngINCOMING);
        btnIncoming.setOnClickListener(onClickListener);

        Button btnJump1 = findViewById(R.id.btnEngJUMP1);
        btnJump1.setOnClickListener(onClickListener);

        Button btnJump2 = findViewById(R.id.btnEngJUMP2);
        btnJump2.setOnClickListener(onClickListener);

        Button btnJustyouwait = findViewById(R.id.btnEngJUSTYOUWAIT);
        btnJustyouwait.setOnClickListener(onClickListener);

        Button btnKamikaze = findViewById(R.id.btnEngKAMIKAZE);
        btnKamikaze.setOnClickListener(onClickListener);

        Button btnLaugh = findViewById(R.id.btnEngLAUGH);
        btnLaugh.setOnClickListener(onClickListener);

        Button btnLeavemealone = findViewById(R.id.btnEngLEAVEMEALONE);
        btnLeavemealone.setOnClickListener(onClickListener);

        Button btnMissed = findViewById(R.id.btnEngMISSED);
        btnMissed.setOnClickListener(onClickListener);

        Button btnNooo = findViewById(R.id.btnEngNOOO);
        btnNooo.setOnClickListener(onClickListener);

        Button btnOhdear = findViewById(R.id.btnEngOHDEAR);
        btnOhdear.setOnClickListener(onClickListener);

        Button btnOinutter = findViewById(R.id.btnEngOINUTTER);
        btnOinutter.setOnClickListener(onClickListener);

        Button btnOoff1 = findViewById(R.id.btnEngOOFF1);
        btnOoff1.setOnClickListener(onClickListener);

        Button btnOoff2 = findViewById(R.id.btnEngOOFF2);
        btnOoff2.setOnClickListener(onClickListener);

        Button btnOoff3 = findViewById(R.id.btnEngOOFF3);
        btnOoff3.setOnClickListener(onClickListener);

        Button btnOops = findViewById(R.id.btnEngOOPS);
        btnOops.setOnClickListener(onClickListener);

        Button btnOrders = findViewById(R.id.btnEngORDERS);
        btnOrders.setOnClickListener(onClickListener);

        Button btnOuch = findViewById(R.id.btnEngOUCH);
        btnOuch.setOnClickListener(onClickListener);

        Button btnOw1 = findViewById(R.id.btnEngOW1);
        btnOw1.setOnClickListener(onClickListener);

        Button btnOw2 = findViewById(R.id.btnEngOW2);
        btnOw2.setOnClickListener(onClickListener);

        Button btnOw3 = findViewById(R.id.btnEngOW3);
        btnOw3.setOnClickListener(onClickListener);

        Button btnPerfect = findViewById(R.id.btnEngPERFECT);
        btnPerfect.setOnClickListener(onClickListener);

        Button btnRevenge = findViewById(R.id.btnEngREVENGE);
        btnRevenge.setOnClickListener(onClickListener);

        Button btnRunaway = findViewById(R.id.btnEngRUNAWAY);
        btnRunaway.setOnClickListener(onClickListener);

        Button btnStupid = findViewById(R.id.btnEngSTUPID);
        btnStupid.setOnClickListener(onClickListener);

        Button btnTakeCover = findViewById(R.id.btnEngTAKECOVER);
        btnTakeCover.setOnClickListener(onClickListener);

        Button btnTraitor = findViewById(R.id.btnEngTRAITOR);
        btnTraitor.setOnClickListener(onClickListener);

        Button btnUhoh = findViewById(R.id.btnEngUHOH);
        btnUhoh.setOnClickListener(onClickListener);

        Button btnVictory = findViewById(R.id.btnEngVICTORY);
        btnVictory.setOnClickListener(onClickListener);

        Button btnWatchthis = findViewById(R.id.btnEngWATCHTHIS);
        btnWatchthis.setOnClickListener(onClickListener);

        Button btnWhatthe = findViewById(R.id.btnEngWHATTHE);
        btnWhatthe.setOnClickListener(onClickListener);

        Button btnWobble = findViewById(R.id.btnEngWOBBLE);
        btnWobble.setOnClickListener(onClickListener);

        Button btnYessir = findViewById(R.id.btnEngYESSIR);
        btnYessir.setOnClickListener(onClickListener);

        Button btnYoullregretthat = findViewById(R.id.btnEngYOULLREGRETTHAT);
        btnYoullregretthat.setOnClickListener(onClickListener);



    }


    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnEngAmazing:
                    playSound(engamazing);
                    break;
                case R.id.btnEngBoring:
                    playSound(engboring);
                    break;
                case R.id.btnEngBrilliant:
                    playSound(engbrilliant);
                    break;
                case R.id.btnEngBummer:
                    playSound(engbummer);
                    break;
                case R.id.btnEngBungee:
                    playSound(engbungle);
                    break;
                case R.id.btnEngByebye:
                    playSound(engbyebye);
                    break;
                case R.id.btnEngCollect:
                    playSound(engcollect);
                    break;
                case R.id.btnEngComeonthen:
                    playSound(engcomeonthen);
                    break;
                case R.id.btnEngCoward:
                    playSound(engcoward);
                    break;
                case R.id.btnEngDRAGONPUNCH:
                    playSound(engdragonpunch);
                    break;
                case R.id.btnEngDROP:
                    playSound(engdrop);
                    break;
                case R.id.btnEngEXCELLENT:
                    playSound(engexellent);
                    break;
                case R.id.btnEngFATALITY:
                    playSound(engfatality);
                    break;
                case R.id.btnEngFIRE:
                    playSound(engfire);
                    break;
                case R.id.btnEngFIREBALL:
                    playSound(engfireball);
                    break;
                case R.id.btnEngFIRSTBLOOD:
                    playSound(engfirstblood);
                    break;
                case R.id.btnEngFLAWLESS:
                    playSound(engflawless);
                    break;
                case R.id.btnEngGOAWAY:
                    playSound(enggoaway);
                    break;
                case R.id.btnEngHELLO:
                    playSound(enghello);
                    break;
                case R.id.btnEngHURRY:
                    playSound(enghurry);
                    break;
                case R.id.btnEngILLGETYOU:
                    playSound(engillgetyou);
                    break;
                case R.id.btnEngGRENADE:
                    playSound(enggrenade);
                    break;
                case R.id.btnEngINCOMING:
                    playSound(engincoming);
                    break;
                case R.id.btnEngJUMP1:
                    playSound(engjump1);
                    break;
                case R.id.btnEngJUMP2:
                    playSound(engjump2);
                    break;
                case R.id.btnEngJUSTYOUWAIT:
                    playSound(engjustyouwait);
                    break;
                case R.id.btnEngKAMIKAZE:
                    playSound(engkamikaze);
                    break;
                case R.id.btnEngLAUGH:
                    playSound(englaugh);
                    break;
                case R.id.btnEngLEAVEMEALONE:
                    playSound(engleavemealone);
                    break;
                case R.id.btnEngMISSED:
                    playSound(engmissed);
                    break;
                case R.id.btnEngNOOO:
                    playSound(engnooo);
                    break;
                case R.id.btnEngOHDEAR:
                    playSound(engohdear);
                    break;
                case R.id.btnEngOINUTTER:
                    playSound(enggrenade);
                    break;
                case R.id.btnEngOOFF1:
                    playSound(engooff1);
                    break;
                case R.id.btnEngOOFF2:
                    playSound(engooff2);
                    break;
                case R.id.btnEngOOFF3:
                    playSound(engooff3);
                    break;
                case R.id.btnEngOOPS:
                    playSound(engoops);
                    break;
                case R.id.btnEngORDERS:
                    playSound(engorders);
                    break;
                case R.id.btnEngOUCH:
                    playSound(engouch);
                    break;
                case R.id.btnEngOW1:
                    playSound(engow1);
                    break;
                case R.id.btnEngOW2:
                    playSound(engow2);
                    break;
                case R.id.btnEngOW3:
                    playSound(engow3);
                    break;
                case R.id.btnEngPERFECT:
                    playSound(engperfect);
                    break;
                case R.id.btnEngREVENGE:
                    playSound(engrevenge);
                    break;
                case R.id.btnEngRUNAWAY:
                    playSound(engrunaway);
                    break;
                case R.id.btnEngSTUPID:
                    playSound(engstupid);
                    break;
                case R.id.btnEngTAKECOVER:
                    playSound(engtakecover);
                    break;
                case R.id.btnEngTRAITOR:
                    playSound(engtraitor);
                    break;
                case R.id.btnUHOH:
                    playSound(enguhoh);
                    break;
                case R.id.btnEngVICTORY:
                    playSound(engvictoty);
                    break;
                case R.id.btnEngWATCHTHIS:
                    playSound(engwatchthis);
                    break;
                case R.id.btnEngWHATTHE:
                    playSound(engwhatthe);
                    break;
                case R.id.btnEngWOBBLE:
                    playSound(engwobble);
                    break;
                case R.id.btnEngYESSIR:
                    playSound(engyessir);
                    break;
                case R.id.btnEngYOULLREGRETTHAT:
                    playSound(engyoullregetthat);
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

        engamazing = loadSound("engAMAZING.WAV");
        engboring = loadSound("engBORING.WAV");
        engbrilliant = loadSound("engBRILLIANT.WAV");
        engbummer = loadSound("engBUMMER.WAV");
        engbungle = loadSound("engBUNGEE.WAV");
        engbyebye = loadSound("engBYEBYE.WAV");
        engcollect = loadSound("engCOLLECT.WAV");
        engcomeonthen = loadSound("engCOMEONTHEN.WAV");
        engcoward = loadSound("engCOWARD.WAV");
        engdragonpunch = loadSound("engDRAGONPUNCH.WAV");
        engdrop = loadSound("engDROP.WAV");
        engexellent = loadSound("engEXCELLENT.WAV");
        engfatality = loadSound("engFATALITY.WAV");
        engfire = loadSound("engFIRE.WAV");
        engfireball = loadSound("engFIREBALL.WAV");
        engfirstblood = loadSound("engFIRSTBLOOD.WAV");
        engflawless = loadSound("engFLAWLESS.WAV");
        enggoaway = loadSound("engGOAWAY.WAV");
        enggrenade = loadSound("engGRENADE.WAV");
        enghello = loadSound("engHELLO.WAV");
        enghurry = loadSound("engHURRY.WAV");
        engincoming = loadSound("engINCOMING.WAV");
        engjump1 = loadSound("engJUMP1.WAV");
        engjump2 = loadSound("engJUMP2.WAV");
        engjustyouwait = loadSound("engJUSTYOUWAIT.WAV");
        englaugh = loadSound("engLAUGH.WAV");
        engleavemealone = loadSound("engLEAVEMEALONE.WAV");
        engmissed = loadSound("engMISSED.WAV");
        engnooo = loadSound("engNOOO.WAV");
        engohdear = loadSound("engOHDEAR.WAV");
        engoinutter = loadSound("engOINUTTER.WAV");
        engooff1 = loadSound("engOOFF1.WAV");
        engooff2 = loadSound("engOOFF2.WAV");
        engooff3 = loadSound("engOOFF3.WAV");
        engoops = loadSound("engOOPS.WAV");
        engorders = loadSound("engORDERS.WAV");
        engouch = loadSound("engOUCH.WAV");
        engow1 = loadSound("engOW1.WAV");
        engkamikaze = loadSound("engKAMIKAZE.WAV");
        engow2 = loadSound("engOW2.WAV");
        engow3 = loadSound("engOW3.WAV");
        engperfect = loadSound("engPERFECT.WAV");
        engrevenge = loadSound("engREVENGE.WAV");
        engrunaway = loadSound("engRUNAWAY.WAV");
        engstupid = loadSound("engSTUPID.WAV");
        engtakecover = loadSound("engTAKECOVER.WAV");
        engtraitor = loadSound("engTRAITOR.WAV");
        enguhoh = loadSound("engUH-OH.WAV");
        engvictoty = loadSound("engVICTORY.WAV");
        engwatchthis = loadSound("engWATCHTHIS.WAV");
        engwhatthe = loadSound("engWHATTHE.WAV");
        engwobble = loadSound("engWOBBLE.WAV");
        engyessir = loadSound("engYESSIR.WAV");
        engyoullregetthat = loadSound("engYOULLREGRETTHAT.WAV");
        engillgetyou = loadSound("engILLGETYOU.WAV");
    }
}