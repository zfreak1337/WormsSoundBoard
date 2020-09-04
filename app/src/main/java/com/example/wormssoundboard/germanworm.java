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

public class germanworm extends AppCompatActivity {

    public SoundPool mSoundPool;
    public AssetManager mAssetManager;
    private int mStreamID;
    private int amazing;
    private int boring;
    private int brilliant;
    private int bummer;
    private int bungle;
    private int byebye;
    private int collect;
    private int comeonthen;
    private int coward;
    private int dragonpunch;
    private int drop;
    private int exellent;
    private int fatality;
    private int fire;
    private int fireball;
    private int firstblood;
    private int flawless;
    private int goaway;
    private int grenade;
    private int hello;
    private int hurry;
    private int illgetyou;
    private int incoming;
    private int jump1;
    private int jump2;
    private int justyouwait;
    private int kamikaze;
    private int laugh;
    private int leavemealone;
    private int missed;
    private int nooo;
    private int ohdear;
    private int oinutter;
    private int ooff1;
    private int ooff2;
    private int ooff3;
    private int oops;
    private int orders;
    private int ouch;
    private int ow1;
    private int ow2;
    private int ow3;
    private int perfect;
    private int revenge;
    private int runaway;
    private int stupid;
    private int takecover;
    private int traitor;
    private int uhoh;
    private int victoty;
    private int watchthis;
    private int whatthe;
    private int wobble;
    private int yessir;
    private int youllregetthat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_germanworm);
        Button btnAmazing = findViewById(R.id.btnGerAmazing);
        btnAmazing.setOnClickListener(onClickListener);

        Button btnBoring = findViewById(R.id.btnGerBoring);
        btnBoring.setOnClickListener(onClickListener);

        Button btnBrilliant = findViewById(R.id.btnGerBrilliant);
        btnBrilliant.setOnClickListener(onClickListener);

        Button btnBummer = findViewById(R.id.btnGerBummer);
        btnBummer.setOnClickListener(onClickListener);

        Button btnBungee = findViewById(R.id.btnGerBungee);
        btnBungee.setOnClickListener(onClickListener);

        Button btnByebye= findViewById(R.id.btnGerByebye);
        btnByebye.setOnClickListener(onClickListener);

        Button btnCollect = findViewById(R.id.btnGerCollect);
        btnCollect.setOnClickListener(onClickListener);

        Button btnComeonthen = findViewById(R.id.btnGerComeonthen);
        btnComeonthen.setOnClickListener(onClickListener);

        Button btnCoward = findViewById(R.id.btnGerCoward);
        btnCoward.setOnClickListener(onClickListener);

        Button btnDroagonpunch = findViewById(R.id.btnGerDRAGONPUNCH);
        btnDroagonpunch.setOnClickListener(onClickListener);

        Button btnDrop = findViewById(R.id.btnGerDROP);
        btnDrop.setOnClickListener(onClickListener);

        Button btnExcellent = findViewById(R.id.btnGerEXCELLENT);
        btnExcellent.setOnClickListener(onClickListener);

        Button btnFatality = findViewById(R.id.btnGerFATALITY);
        btnFatality.setOnClickListener(onClickListener);

        Button btnFire = findViewById(R.id.btnGerFIRE);
        btnFire.setOnClickListener(onClickListener);

        Button btnFireball = findViewById(R.id.btnGerFIREBALL);
        btnFireball.setOnClickListener(onClickListener);

        Button btnFirstblood = findViewById(R.id.btnGerFIRSTBLOOD);
        btnFirstblood.setOnClickListener(onClickListener);

        Button btnFlawLess = findViewById(R.id.btnGerFLAWLESS);
        btnFlawLess.setOnClickListener(onClickListener);

        Button btnGoaway = findViewById(R.id.btnGerGOAWAY);
        btnGoaway.setOnClickListener(onClickListener);

        Button btnGrenade = findViewById(R.id.btnGerGRENADE);
        btnGrenade.setOnClickListener(onClickListener);

        Button btnHello = findViewById(R.id.btnGerHELLO);
        btnHello.setOnClickListener(onClickListener);

        Button btnHurry = findViewById(R.id.btnGerHURRY);
        btnHurry.setOnClickListener(onClickListener);

        Button btnIllegetyou = findViewById(R.id.btnGerILLGETYOU);
        btnIllegetyou.setOnClickListener(onClickListener);

        Button btnIncoming = findViewById(R.id.btnGerINCOMING);
        btnIncoming.setOnClickListener(onClickListener);

        Button btnJump1 = findViewById(R.id.btnGerJUMP1);
        btnJump1.setOnClickListener(onClickListener);

        Button btnJump2 = findViewById(R.id.btnGerJUMP2);
        btnJump2.setOnClickListener(onClickListener);

        Button btnJustyouwait = findViewById(R.id.btnGerJUSTYOUWAIT);
        btnJustyouwait.setOnClickListener(onClickListener);

        Button btnKamikaze = findViewById(R.id.btnGerKAMIKAZE);
        btnKamikaze.setOnClickListener(onClickListener);

        Button btnLaugh = findViewById(R.id.btnGerLAUGH);
        btnLaugh.setOnClickListener(onClickListener);

        Button btnLeavemealone = findViewById(R.id.btnGerLEAVEMEALONE);
        btnLeavemealone.setOnClickListener(onClickListener);

        Button btnMissed = findViewById(R.id.btnGerMISSED);
        btnMissed.setOnClickListener(onClickListener);

        Button btnNooo = findViewById(R.id.btnGerNOOO);
        btnNooo.setOnClickListener(onClickListener);

        Button btnOhdear = findViewById(R.id.btnGerOHDEAR);
        btnOhdear.setOnClickListener(onClickListener);

        Button btnOinutter = findViewById(R.id.btnGerOINUTTER);
        btnOinutter.setOnClickListener(onClickListener);

        Button btnOoff1 = findViewById(R.id.btnGerOOFF1);
        btnOoff1.setOnClickListener(onClickListener);

        Button btnOoff2 = findViewById(R.id.btnGerOOFF2);
        btnOoff2.setOnClickListener(onClickListener);

        Button btnOoff3 = findViewById(R.id.btnGerOOFF3);
        btnOoff3.setOnClickListener(onClickListener);

        Button btnOops = findViewById(R.id.btnGerOOPS);
        btnOops.setOnClickListener(onClickListener);

        Button btnOrders = findViewById(R.id.btnGerORDERS);
        btnOrders.setOnClickListener(onClickListener);

        Button btnOuch = findViewById(R.id.btnGerOUCH);
        btnOuch.setOnClickListener(onClickListener);

        Button btnOw1 = findViewById(R.id.btnGerOW1);
        btnOw1.setOnClickListener(onClickListener);

        Button btnOw2 = findViewById(R.id.btnGerOW2);
        btnOw2.setOnClickListener(onClickListener);

        Button btnOw3 = findViewById(R.id.btnGerOW3);
        btnOw3.setOnClickListener(onClickListener);

        Button btnPerfect = findViewById(R.id.btnGerPERFECT);
        btnPerfect.setOnClickListener(onClickListener);

        Button btnRevenge = findViewById(R.id.btnGerREVENGE);
        btnRevenge.setOnClickListener(onClickListener);

        Button btnRunaway = findViewById(R.id.btnGerRUNAWAY);
        btnRunaway.setOnClickListener(onClickListener);

        Button btnStupid = findViewById(R.id.btnGerSTUPID);
        btnStupid.setOnClickListener(onClickListener);

        Button btnTakeCover = findViewById(R.id.btnGerTAKECOVER);
        btnTakeCover.setOnClickListener(onClickListener);

        Button btnTraitor = findViewById(R.id.btnGerTRAITOR);
        btnTraitor.setOnClickListener(onClickListener);

        Button btnUhoh = findViewById(R.id.btnGerUHOH);
        btnUhoh.setOnClickListener(onClickListener);

        Button btnVictory = findViewById(R.id.btnGerVICTORY);
        btnVictory.setOnClickListener(onClickListener);

        Button btnWatchthis = findViewById(R.id.btnGerWATCHTHIS);
        btnWatchthis.setOnClickListener(onClickListener);

        Button btnWhatthe = findViewById(R.id.btnGerWHATTHE);
        btnWhatthe.setOnClickListener(onClickListener);
        

        Button btnYessir = findViewById(R.id.btnGerYESSIR);
        btnYessir.setOnClickListener(onClickListener);

        Button btnYoullregretthat = findViewById(R.id.btnGerYOULLREGRETTHAT);
        btnYoullregretthat.setOnClickListener(onClickListener);



    }


    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnGerAmazing:
                    playSound(amazing);
                    break;
                case R.id.btnGerBoring:
                    playSound(boring);
                    break;
                case R.id.btnGerBrilliant:
                    playSound(brilliant);
                    break;
                case R.id.btnGerBummer:
                    playSound(bummer);
                    break;
                case R.id.btnGerBungee:
                    playSound(bungle);
                    break;
                case R.id.btnGerByebye:
                    playSound(byebye);
                    break;
                case R.id.btnGerCollect:
                    playSound(collect);
                    break;
                case R.id.btnGerComeonthen:
                    playSound(comeonthen);
                    break;
                case R.id.btnGerCoward:
                    playSound(coward);
                    break;
                case R.id.btnGerDRAGONPUNCH:
                    playSound(dragonpunch);
                    break;
                case R.id.btnGerDROP:
                    playSound(drop);
                    break;
                case R.id.btnGerEXCELLENT:
                    playSound(exellent);
                    break;
                case R.id.btnGerFATALITY:
                    playSound(fatality);
                    break;
                case R.id.btnGerFIRE:
                    playSound(fire);
                    break;
                case R.id.btnGerFIREBALL:
                    playSound(fireball);
                    break;
                case R.id.btnGerFIRSTBLOOD:
                    playSound(firstblood);
                    break;
                case R.id.btnGerFLAWLESS:
                    playSound(flawless);
                    break;
                case R.id.btnGerGOAWAY:
                    playSound(goaway);
                    break;
                case R.id.btnGerHELLO:
                    playSound(hello);
                    break;
                case R.id.btnGerHURRY:
                    playSound(hurry);
                    break;
                case R.id.btnGerILLGETYOU:
                    playSound(illgetyou);
                    break;
                case R.id.btnGerGRENADE:
                    playSound(grenade);
                    break;
                case R.id.btnGerINCOMING:
                    playSound(incoming);
                    break;
                case R.id.btnGerJUMP1:
                    playSound(jump1);
                    break;
                case R.id.btnGerJUMP2:
                    playSound(jump2);
                    break;
                case R.id.btnGerJUSTYOUWAIT:
                    playSound(justyouwait);
                    break;
                case R.id.btnGerKAMIKAZE:
                    playSound(kamikaze);
                    break;
                case R.id.btnGerLAUGH:
                    playSound(laugh);
                    break;
                case R.id.btnGerLEAVEMEALONE:
                    playSound(leavemealone);
                    break;
                case R.id.btnGerMISSED:
                    playSound(missed);
                    break;
                case R.id.btnGerNOOO:
                    playSound(nooo);
                    break;
                case R.id.btnGerOHDEAR:
                    playSound(ohdear);
                    break;
                case R.id.btnGerOINUTTER:
                    playSound(grenade);
                    break;
                case R.id.btnGerOOFF1:
                    playSound(ooff1);
                    break;
                case R.id.btnGerOOFF2:
                    playSound(ooff2);
                    break;
                case R.id.btnGerOOFF3:
                    playSound(ooff3);
                    break;
                case R.id.btnGerOOPS:
                    playSound(oops);
                    break;
                case R.id.btnGerORDERS:
                    playSound(orders);
                    break;
                case R.id.btnGerOUCH:
                    playSound(ouch);
                    break;
                case R.id.btnGerOW1:
                    playSound(ow1);
                    break;
                case R.id.btnGerOW2:
                    playSound(ow2);
                    break;
                case R.id.btnGerOW3:
                    playSound(ow3);
                    break;
                case R.id.btnGerPERFECT:
                    playSound(perfect);
                    break;
                case R.id.btnGerREVENGE:
                    playSound(revenge);
                    break;
                case R.id.btnGerRUNAWAY:
                    playSound(runaway);
                    break;
                case R.id.btnGerSTUPID:
                    playSound(stupid);
                    break;
                case R.id.btnGerTAKECOVER:
                    playSound(takecover);
                    break;
                case R.id.btnGerTRAITOR:
                    playSound(traitor);
                    break;
                case R.id.btnGerUHOH:
                    playSound(uhoh);
                    break;
                case R.id.btnGerVICTORY:
                    playSound(victoty);
                    break;
                case R.id.btnGerWATCHTHIS:
                    playSound(watchthis);
                    break;
                case R.id.btnGerWHATTHE:
                    playSound(whatthe);
                    break;
                case R.id.btnGerYESSIR:
                    playSound(yessir);
                    break;
                case R.id.btnGerYOULLREGRETTHAT:
                    playSound(youllregetthat);
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

        amazing = loadSound("gerAMAZING.WAV");
        boring = loadSound("gerBORING.WAV");
        brilliant = loadSound("gerBRILLIANT.WAV");
        bummer = loadSound("gerBUMMER.WAV");
        bungle = loadSound("gerBUNGEE.WAV");
        byebye = loadSound("gerBYEBYE.WAV");
        collect = loadSound("gerCOLLECT.WAV");
        comeonthen = loadSound("gerCOMEONTHEN.WAV");
        coward = loadSound("gerCOWARD.WAV");
        dragonpunch = loadSound("gerDRAGONPUNCH.WAV");
        drop = loadSound("gerDROP.WAV");
        exellent = loadSound("gerEXCELLENT.WAV");
        fatality = loadSound("gerFATALITY.WAV");
        fire = loadSound("gerFIRE.WAV");
        fireball = loadSound("gerFIREBALL.WAV");
        firstblood = loadSound("gerFIRSTBLOOD.WAV");
        flawless = loadSound("gerFLAWLESS.WAV");
        goaway = loadSound("gerGOAWAY.WAV");
        grenade = loadSound("gerGRENADE.WAV");
        hello = loadSound("gerHELLO.WAV");
        hurry = loadSound("gerHURRY.WAV");
        incoming = loadSound("gerINCOMING.WAV");
        jump1 = loadSound("gerJUMP1.WAV");
        jump2 = loadSound("gerJUMP2.WAV");
        justyouwait = loadSound("gerJUSTYOUWAIT.WAV");
        laugh = loadSound("gerLAUGH.WAV");
        leavemealone = loadSound("gerLEAVEMEALONE.WAV");
        missed = loadSound("gerMISSED.WAV");
        nooo = loadSound("gerNOOO.WAV");
        ohdear = loadSound("gerOHDEAR.WAV");
        oinutter = loadSound("gerOINUTTER.WAV");
        ooff1 = loadSound("gerOOFF1.WAV");
        ooff2 = loadSound("gerOOFF2.WAV");
        ooff3 = loadSound("gerOOFF3.WAV");
        oops = loadSound("gerOOPS.WAV");
        orders = loadSound("gerORDERS.WAV");
        ouch = loadSound("gerOUCH.WAV");
        ow1 = loadSound("gerOW1.WAV");
        kamikaze = loadSound("gerKAMIKAZE.WAV");
        ow2 = loadSound("gerOW2.WAV");
        ow3 = loadSound("gerOW3.WAV");
        perfect = loadSound("gerPERFECT.WAV");
        revenge = loadSound("gerREVENGE.WAV");
        runaway = loadSound("gerRUNAWAY.WAV");
        stupid = loadSound("gerSTUPID.WAV");
        takecover = loadSound("gerTAKECOVER.WAV");
        traitor = loadSound("gerTRAITOR.WAV");
        uhoh = loadSound("gerUH-OH.WAV");
        victoty = loadSound("gerVICTORY.WAV");
        watchthis = loadSound("gerWATCHTHIS.WAV");
        whatthe = loadSound("gerWHATTHE.WAV");
        wobble = loadSound("gerWOBBLE.WAV");
        yessir = loadSound("gerYESSIR.WAV");
        youllregetthat = loadSound("gerYOULLREGRETTHAT.WAV");
        illgetyou = loadSound("gerILLGETYOU.WAV");
    }
}