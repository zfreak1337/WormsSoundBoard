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

public class kamikazeworm extends AppCompatActivity {
    public SoundPool mSoundPool;
    public AssetManager mAssetManager;
    public int mStreamID;
    public int kamikazeamazing;
    public int kamikazeboring;
    private int kamikazebrilliant;
    private int kamikazebummer;
    private int kamikazebungle;
    private int kamikazebyebye;
    private int kamikazecollect;
    private int kamikazecomeonthen;
    private int kamikazecoward;
    private int kamikazedragonpunch;
    private int kamikazedrop;
    private int kamikazeexellent;
    private int kamikazefatality;
    private int kamikazefire;
    private int kamikazefireball;
    private int kamikazefirstblood;
    private int kamikazeflawless;
    private int kamikazegoaway;
    private int kamikazegrenade;
    private int kamikazehello;
    private int kamikazehurry;
    private int kamikazeillgetyou;
    private int kamikazeincoming;
    private int kamikazejump1;
    private int kamikazejump2;
    private int kamikazejustyouwait;
    private int kamikazekamikaze;
    private int kamikazelaugh;
    private int kamikazeleavemealone;
    private int kamikazemissed;
    private int kamikazenooo;
    private int kamikazeohdear;
    public int kamikazeoinutter;
    public int kamikazeooff1;
    public int kamikazeooff2;
    public int kamikazeooff3;
    public int kamikazeoops;
    public int kamikazeorders;
    public int kamikazeouch;
    public int kamikazeow1;
    public int kamikazeow2;
    public int kamikazeow3;
    public int kamikazeperfect;
    public int kamikazerevenge;
    public int kamikazerunaway;
    public int kamikazestupid;
    public int kamikazetakecover;
    public int kamikazetraitor;
    public int kamikazeuhoh;
    public int kamikazevictoty;
    public int kamikazewatchthis;
    public int kamikazewhatthe;
    public int kamikazewobble;
    public int kamikazeyessir;
    public int kamikazeyoullregetthat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamikazeworm);
        Button btnAmazing = findViewById(R.id.btnKamikazeAmazing);
        btnAmazing.setOnClickListener(onClickListener);

        Button btnBoring = findViewById(R.id.btnKamikazeBoring);
        btnBoring.setOnClickListener(onClickListener);

        Button btnBrilliant = findViewById(R.id.btnKamikazeBrilliant);
        btnBrilliant.setOnClickListener(onClickListener);

        Button btnBummer = findViewById(R.id.btnKamikazeBummer);
        btnBummer.setOnClickListener(onClickListener);

        Button btnBungee = findViewById(R.id.btnKamikazeBungee);
        btnBungee.setOnClickListener(onClickListener);

        Button btnByebye= findViewById(R.id.btnKamikazeByebye);
        btnByebye.setOnClickListener(onClickListener);

        Button btnCollect = findViewById(R.id.btnKamikazeCollect);
        btnCollect.setOnClickListener(onClickListener);

        Button btnComeonthen = findViewById(R.id.btnKamikazeComeonthen);
        btnComeonthen.setOnClickListener(onClickListener);

        Button btnCoward = findViewById(R.id.btnKamikazeCoward);
        btnCoward.setOnClickListener(onClickListener);

        Button btnDroagonpunch = findViewById(R.id.btnKamikazeDRAGONPUNCH);
        btnDroagonpunch.setOnClickListener(onClickListener);

        Button btnDrop = findViewById(R.id.btnKamikazeDROP);
        btnDrop.setOnClickListener(onClickListener);

        Button btnExcellent = findViewById(R.id.btnKamikazeEXCELLENT);
        btnExcellent.setOnClickListener(onClickListener);

        Button btnFatality = findViewById(R.id.btnKamikazeFATALITY);
        btnFatality.setOnClickListener(onClickListener);

        Button btnFire = findViewById(R.id.btnKamikazeFIRE);
        btnFire.setOnClickListener(onClickListener);

        Button btnFireball = findViewById(R.id.btnKamikazeFIREBALL);
        btnFireball.setOnClickListener(onClickListener);

        Button btnFirstblood = findViewById(R.id.btnKamikazeFIRSTBLOOD);
        btnFirstblood.setOnClickListener(onClickListener);

        Button btnFlawLess = findViewById(R.id.btnKamikazeFLAWLESS);
        btnFlawLess.setOnClickListener(onClickListener);

        Button btnGoaway = findViewById(R.id.btnKamikazeGOAWAY);
        btnGoaway.setOnClickListener(onClickListener);

        Button btnGrenade = findViewById(R.id.btnKamikazeGRENADE);
        btnGrenade.setOnClickListener(onClickListener);

        Button btnHello = findViewById(R.id.btnKamikazeHELLO);
        btnHello.setOnClickListener(onClickListener);

        Button btnHurry = findViewById(R.id.btnKamikazeHURRY);
        btnHurry.setOnClickListener(onClickListener);

        Button btnIllegetyou = findViewById(R.id.btnKamikazeILLGETYOU);
        btnIllegetyou.setOnClickListener(onClickListener);

        Button btnIncoming = findViewById(R.id.btnKamikazeINCOMING);
        btnIncoming.setOnClickListener(onClickListener);

        Button btnJump1 = findViewById(R.id.btnKamikazeJUMP1);
        btnJump1.setOnClickListener(onClickListener);

        Button btnJump2 = findViewById(R.id.btnKamikazeJUMP2);
        btnJump2.setOnClickListener(onClickListener);

        Button btnJustyouwait = findViewById(R.id.btnKamikazeJUSTYOUWAIT);
        btnJustyouwait.setOnClickListener(onClickListener);

        Button btnKamikaze = findViewById(R.id.btnKamikazeKAMIKAZE);
        btnKamikaze.setOnClickListener(onClickListener);

        Button btnLaugh = findViewById(R.id.btnKamikazeLAUGH);
        btnLaugh.setOnClickListener(onClickListener);

        Button btnLeavemealone = findViewById(R.id.btnKamikazeLEAVEMEALONE);
        btnLeavemealone.setOnClickListener(onClickListener);

        Button btnMissed = findViewById(R.id.btnKamikazeMISSED);
        btnMissed.setOnClickListener(onClickListener);

        Button btnNooo = findViewById(R.id.btnKamikazeNOOO);
        btnNooo.setOnClickListener(onClickListener);

        Button btnOhdear = findViewById(R.id.btnKamikazeOHDEAR);
        btnOhdear.setOnClickListener(onClickListener);

        Button btnOinutter = findViewById(R.id.btnKamikazeOINUTTER);
        btnOinutter.setOnClickListener(onClickListener);

        Button btnOoff1 = findViewById(R.id.btnKamikazeOOFF1);
        btnOoff1.setOnClickListener(onClickListener);

        Button btnOoff2 = findViewById(R.id.btnKamikazeOOFF2);
        btnOoff2.setOnClickListener(onClickListener);

        Button btnOoff3 = findViewById(R.id.btnKamikazeOOFF3);
        btnOoff3.setOnClickListener(onClickListener);

        Button btnOops = findViewById(R.id.btnKamikazeOOPS);
        btnOops.setOnClickListener(onClickListener);

        Button btnOrders = findViewById(R.id.btnKamikazeORDERS);
        btnOrders.setOnClickListener(onClickListener);

        Button btnOuch = findViewById(R.id.btnKamikazeOUCH);
        btnOuch.setOnClickListener(onClickListener);

        Button btnOw1 = findViewById(R.id.btnKamikazeOW1);
        btnOw1.setOnClickListener(onClickListener);

        Button btnOw2 = findViewById(R.id.btnKamikazeOW2);
        btnOw2.setOnClickListener(onClickListener);

        Button btnOw3 = findViewById(R.id.btnKamikazeOW3);
        btnOw3.setOnClickListener(onClickListener);

        Button btnPerfect = findViewById(R.id.btnKamikazePERFECT);
        btnPerfect.setOnClickListener(onClickListener);

        Button btnRevenge = findViewById(R.id.btnKamikazeREVENGE);
        btnRevenge.setOnClickListener(onClickListener);

        Button btnRunaway = findViewById(R.id.btnKamikazeRUNAWAY);
        btnRunaway.setOnClickListener(onClickListener);

        Button btnStupid = findViewById(R.id.btnKamikazeSTUPID);
        btnStupid.setOnClickListener(onClickListener);

        Button btnTakeCover = findViewById(R.id.btnKamikazeTAKECOVER);
        btnTakeCover.setOnClickListener(onClickListener);

        Button btnTraitor = findViewById(R.id.btnKamikazeTRAITOR);
        btnTraitor.setOnClickListener(onClickListener);

        Button btnUhoh = findViewById(R.id.btnKamikazeUHOH);
        btnUhoh.setOnClickListener(onClickListener);

        Button btnVictory = findViewById(R.id.btnKamikazeVICTORY);
        btnVictory.setOnClickListener(onClickListener);

        Button btnWatchthis = findViewById(R.id.btnKamikazeWATCHTHIS);
        btnWatchthis.setOnClickListener(onClickListener);

        Button btnWhatthe = findViewById(R.id.btnKamikazeWHATTHE);
        btnWhatthe.setOnClickListener(onClickListener);

        Button btnWobble = findViewById(R.id.btnKamikazeWOBBLE);
        btnWobble.setOnClickListener(onClickListener);

        Button btnYessir = findViewById(R.id.btnKamikazeYESSIR);
        btnYessir.setOnClickListener(onClickListener);

        Button btnYoullregretthat = findViewById(R.id.btnKamikazeYOULLREGRETTHAT);
        btnYoullregretthat.setOnClickListener(onClickListener);



    }


    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnKamikazeAmazing:
                    playSound(kamikazeamazing);
                    break;
                case R.id.btnKamikazeBoring:
                    playSound(kamikazeboring);
                    break;
                case R.id.btnKamikazeBrilliant:
                    playSound(kamikazebrilliant);
                    break;
                case R.id.btnKamikazeBummer:
                    playSound(kamikazebummer);
                    break;
                case R.id.btnKamikazeBungee:
                    playSound(kamikazebungle);
                    break;
                case R.id.btnKamikazeByebye:
                    playSound(kamikazebyebye);
                    break;
                case R.id.btnKamikazeCollect:
                    playSound(kamikazecollect);
                    break;
                case R.id.btnKamikazeComeonthen:
                    playSound(kamikazecomeonthen);
                    break;
                case R.id.btnKamikazeCoward:
                    playSound(kamikazecoward);
                    break;
                case R.id.btnKamikazeDRAGONPUNCH:
                    playSound(kamikazedragonpunch);
                    break;
                case R.id.btnKamikazeDROP:
                    playSound(kamikazedrop);
                    break;
                case R.id.btnKamikazeEXCELLENT:
                    playSound(kamikazeexellent);
                    break;
                case R.id.btnKamikazeFATALITY:
                    playSound(kamikazefatality);
                    break;
                case R.id.btnKamikazeFIRE:
                    playSound(kamikazefire);
                    break;
                case R.id.btnKamikazeFIREBALL:
                    playSound(kamikazefireball);
                    break;
                case R.id.btnKamikazeFIRSTBLOOD:
                    playSound(kamikazefirstblood);
                    break;
                case R.id.btnKamikazeFLAWLESS:
                    playSound(kamikazeflawless);
                    break;
                case R.id.btnKamikazeGOAWAY:
                    playSound(kamikazegoaway);
                    break;
                case R.id.btnKamikazeHELLO:
                    playSound(kamikazehello);
                    break;
                case R.id.btnKamikazeHURRY:
                    playSound(kamikazehurry);
                    break;
                case R.id.btnKamikazeILLGETYOU:
                    playSound(kamikazeillgetyou);
                    break;
                case R.id.btnKamikazeGRENADE:
                    playSound(kamikazegrenade);
                    break;
                case R.id.btnKamikazeINCOMING:
                    playSound(kamikazeincoming);
                    break;
                case R.id.btnKamikazeJUMP1:
                    playSound(kamikazejump1);
                    break;
                case R.id.btnKamikazeJUMP2:
                    playSound(kamikazejump2);
                    break;
                case R.id.btnKamikazeJUSTYOUWAIT:
                    playSound(kamikazejustyouwait);
                    break;
                case R.id.btnKamikazeKAMIKAZE:
                    playSound(kamikazekamikaze);
                    break;
                case R.id.btnKamikazeLAUGH:
                    playSound(kamikazelaugh);
                    break;
                case R.id.btnKamikazeLEAVEMEALONE:
                    playSound(kamikazeleavemealone);
                    break;
                case R.id.btnKamikazeMISSED:
                    playSound(kamikazemissed);
                    break;
                case R.id.btnKamikazeNOOO:
                    playSound(kamikazenooo);
                    break;
                case R.id.btnKamikazeOHDEAR:
                    playSound(kamikazeohdear);
                    break;
                case R.id.btnKamikazeOINUTTER:
                    playSound(kamikazegrenade);
                    break;
                case R.id.btnKamikazeOOFF1:
                    playSound(kamikazeooff1);
                    break;
                case R.id.btnKamikazeOOFF2:
                    playSound(kamikazeooff2);
                    break;
                case R.id.btnKamikazeOOFF3:
                    playSound(kamikazeooff3);
                    break;
                case R.id.btnKamikazeOOPS:
                    playSound(kamikazeoops);
                    break;
                case R.id.btnKamikazeORDERS:
                    playSound(kamikazeorders);
                    break;
                case R.id.btnKamikazeOUCH:
                    playSound(kamikazeouch);
                    break;
                case R.id.btnKamikazeOW1:
                    playSound(kamikazeow1);
                    break;
                case R.id.btnKamikazeOW2:
                    playSound(kamikazeow2);
                    break;
                case R.id.btnKamikazeOW3:
                    playSound(kamikazeow3);
                    break;
                case R.id.btnKamikazePERFECT:
                    playSound(kamikazeperfect);
                    break;
                case R.id.btnKamikazeREVENGE:
                    playSound(kamikazerevenge);
                    break;
                case R.id.btnKamikazeRUNAWAY:
                    playSound(kamikazerunaway);
                    break;
                case R.id.btnKamikazeSTUPID:
                    playSound(kamikazestupid);
                    break;
                case R.id.btnKamikazeTAKECOVER:
                    playSound(kamikazetakecover);
                    break;
                case R.id.btnKamikazeTRAITOR:
                    playSound(kamikazetraitor);
                    break;
                case R.id.btnKamikazeUHOH:
                    playSound(kamikazeuhoh);
                    break;
                case R.id.btnKamikazeVICTORY:
                    playSound(kamikazevictoty);
                    break;
                case R.id.btnKamikazeWATCHTHIS:
                    playSound(kamikazewatchthis);
                    break;
                case R.id.btnKamikazeWHATTHE:
                    playSound(kamikazewhatthe);
                    break;
                case R.id.btnKamikazeWOBBLE:
                    playSound(kamikazewobble);
                    break;
                case R.id.btnKamikazeYESSIR:
                    playSound(kamikazeyessir);
                    break;
                case R.id.btnKamikazeYOULLREGRETTHAT:
                    playSound(kamikazeyoullregetthat);
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

        kamikazeamazing = loadSound("KamikazeAMAZING.WAV");
        kamikazeboring = loadSound("KamikazeBORING.WAV");
        kamikazebrilliant = loadSound("KamikazeBRILLIANT.WAV");
        kamikazebummer = loadSound("KamikazeBUMMER.WAV");
        kamikazebungle = loadSound("KamikazeBUNGEE.WAV");
        kamikazebyebye = loadSound("KamikazeBYEBYE.WAV");
        kamikazecollect = loadSound("KamikazeCOLLECT.WAV");
        kamikazecomeonthen = loadSound("KamikazeCOMEONTHEN.WAV");
        kamikazecoward = loadSound("KamikazeCOWARD.WAV");
        kamikazedragonpunch = loadSound("KamikazeDRAGONPUNCH.WAV");
        kamikazedrop = loadSound("KamikazeDROP.WAV");
        kamikazeexellent = loadSound("KamikazeEXCELLENT.WAV");
        kamikazefatality = loadSound("KamikazeFATALITY.WAV");
        kamikazefire = loadSound("KamikazeFIRE.WAV");
        kamikazefireball = loadSound("KamikazeFIREBALL.WAV");
        kamikazefirstblood = loadSound("KamikazeFIRSTBLOOD.WAV");
        kamikazeflawless = loadSound("KamikazeFLAWLESS.WAV");
        kamikazegoaway = loadSound("KamikazeGOAWAY.WAV");
        kamikazegrenade = loadSound("KamikazeGRENADE.WAV");
        kamikazehello = loadSound("KamikazeHELLO.WAV");
        kamikazehurry = loadSound("KamikazeHURRY.WAV");
        kamikazeincoming = loadSound("KamikazeINCOMING.WAV");
        kamikazejump1 = loadSound("KamikazeJUMP1.WAV");
        kamikazejump2 = loadSound("KamikazeJUMP2.WAV");
        kamikazejustyouwait = loadSound("KamikazeJUSTYOUWAIT.WAV");
        kamikazelaugh = loadSound("KamikazeLAUGH.WAV");
        kamikazeleavemealone = loadSound("KamikazeLEAVEMEALONE.WAV");
        kamikazemissed = loadSound("KamikazeMISSED.WAV");
        kamikazenooo = loadSound("KamikazeNOOO.WAV");
        kamikazeohdear = loadSound("OHDEAR.WAV");
        kamikazeoinutter = loadSound("OINUTTER.WAV");
        kamikazeooff1 = loadSound("KamikazeOOFF1.WAV");
        kamikazeooff2 = loadSound("KamikazeOOFF2.WAV");
        kamikazeooff3 = loadSound("KamikazeOOFF3.WAV");
        kamikazeoops = loadSound("KamikazeOOPS.WAV");
        kamikazeorders = loadSound("KamikazeORDERS.WAV");
        kamikazeouch = loadSound("KamikazeOUCH.WAV");
        kamikazeow1 = loadSound("KamikazeOW1.WAV");
        kamikazekamikaze = loadSound("KamikazeKAMIKAZE.WAV");
        kamikazeow2 = loadSound("KamikazeOW2.WAV");
        kamikazeow3 = loadSound("KamikazeOW3.WAV");
        kamikazeperfect = loadSound("KamikazePERFECT.WAV");
        kamikazerevenge = loadSound("KamikazeREVENGE.WAV");
        kamikazerunaway = loadSound("KamikazeRUNAWAY.WAV");
        kamikazestupid = loadSound("KamikazeSTUPID.WAV");
        kamikazetakecover = loadSound("KamikazeTAKECOVER.WAV");
        kamikazetraitor = loadSound("KamikazeTRAITOR.WAV");
        kamikazeuhoh = loadSound("KamikazeUH-OH.WAV");
        kamikazevictoty = loadSound("KamikazeVICTORY.WAV");
        kamikazewatchthis = loadSound("KamikazeWATCHTHIS.WAV");
        kamikazewhatthe = loadSound("KamikazeWHATTHE.WAV");
        kamikazewobble = loadSound("KamikazeWOBBLE.WAV");
        kamikazeyessir = loadSound("KamikazeYESSIR.WAV");
        kamikazeyoullregetthat = loadSound("KamikazeYOULLREGRETTHAT.WAV");
        kamikazeillgetyou = loadSound("KamikazeILLGETYOU.WAV");

    }
}
