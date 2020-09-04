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

public class polish extends AppCompatActivity {

    public SoundPool mSoundPool;
    public AssetManager mAssetManager;
    public int mStreamID;
    public int amazing;
    public int boring;
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
    public int oinutter;
    public int ooff1;
    public int ooff2;
    public int ooff3;
    public int oops;
    public int orders;
    public int ouch;
    public int ow1;
    public int ow2;
    public int ow3;
    public int perfect;
    public int revenge;
    public int runaway;
    public int stupid;
    public int takecover;
    public int traitor;
    public int uhoh;
    public int victoty;
    public int watchthis;
    public int whatthe;
    public int wobble;
    public int yessir;
    public int youllregetthat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polish);
        Button btnAmazing = findViewById(R.id.btnAmazing);
        btnAmazing.setOnClickListener(onClickListener);

        Button btnBoring = findViewById(R.id.btnBoring);
        btnBoring.setOnClickListener(onClickListener);

        Button btnBrilliant = findViewById(R.id.btnBrilliant);
        btnBrilliant.setOnClickListener(onClickListener);

        Button btnBummer = findViewById(R.id.btnBummer);
        btnBummer.setOnClickListener(onClickListener);

        Button btnBungee = findViewById(R.id.btnBungee);
        btnBungee.setOnClickListener(onClickListener);

        Button btnByebye= findViewById(R.id.btnByebye);
        btnByebye.setOnClickListener(onClickListener);

        Button btnCollect = findViewById(R.id.btnCollect);
        btnCollect.setOnClickListener(onClickListener);

        Button btnComeonthen = findViewById(R.id.btnComeonthen);
        btnComeonthen.setOnClickListener(onClickListener);

        Button btnCoward = findViewById(R.id.btnCoward);
        btnCoward.setOnClickListener(onClickListener);

        Button btnDroagonpunch = findViewById(R.id.btnDRAGONPUNCH);
        btnDroagonpunch.setOnClickListener(onClickListener);

        Button btnDrop = findViewById(R.id.btnDROP);
        btnDrop.setOnClickListener(onClickListener);

        Button btnExcellent = findViewById(R.id.btnEXCELLENT);
        btnExcellent.setOnClickListener(onClickListener);

        Button btnFatality = findViewById(R.id.btnFATALITY);
        btnFatality.setOnClickListener(onClickListener);

        Button btnFire = findViewById(R.id.btnFIRE);
        btnFire.setOnClickListener(onClickListener);

        Button btnFireball = findViewById(R.id.btnFIREBALL);
        btnFireball.setOnClickListener(onClickListener);

        Button btnFirstblood = findViewById(R.id.btnFIRSTBLOOD);
        btnFirstblood.setOnClickListener(onClickListener);

        Button btnFlawLess = findViewById(R.id.btnFLAWLESS);
        btnFlawLess.setOnClickListener(onClickListener);

        Button btnGoaway = findViewById(R.id.btnGOAWAY);
        btnGoaway.setOnClickListener(onClickListener);

        Button btnGrenade = findViewById(R.id.btnGRENADE);
        btnGrenade.setOnClickListener(onClickListener);

        Button btnHello = findViewById(R.id.btnHELLO);
        btnHello.setOnClickListener(onClickListener);

        Button btnHurry = findViewById(R.id.btnHURRY);
        btnHurry.setOnClickListener(onClickListener);

        Button btnIllegetyou = findViewById(R.id.btnILLGETYOU);
        btnIllegetyou.setOnClickListener(onClickListener);

        Button btnIncoming = findViewById(R.id.btnINCOMING);
        btnIncoming.setOnClickListener(onClickListener);

        Button btnJump1 = findViewById(R.id.btnJUMP1);
        btnJump1.setOnClickListener(onClickListener);

        Button btnJump2 = findViewById(R.id.btnJUMP2);
        btnJump2.setOnClickListener(onClickListener);

        Button btnJustyouwait = findViewById(R.id.btnJUSTYOUWAIT);
        btnJustyouwait.setOnClickListener(onClickListener);

        Button btnKamikaze = findViewById(R.id.btnKAMIKAZE);
        btnKamikaze.setOnClickListener(onClickListener);

        Button btnLaugh = findViewById(R.id.btnLAUGH);
        btnLaugh.setOnClickListener(onClickListener);

        Button btnLeavemealone = findViewById(R.id.btnLEAVEMEALONE);
        btnLeavemealone.setOnClickListener(onClickListener);

        Button btnMissed = findViewById(R.id.btnMISSED);
        btnMissed.setOnClickListener(onClickListener);

        Button btnNooo = findViewById(R.id.btnNOOO);
        btnNooo.setOnClickListener(onClickListener);

        Button btnOhdear = findViewById(R.id.btnOHDEAR);
        btnOhdear.setOnClickListener(onClickListener);

        Button btnOinutter = findViewById(R.id.btnOINUTTER);
        btnOinutter.setOnClickListener(onClickListener);

        Button btnOoff1 = findViewById(R.id.btnOOFF1);
        btnOoff1.setOnClickListener(onClickListener);

        Button btnOoff2 = findViewById(R.id.btnOOFF2);
        btnOoff2.setOnClickListener(onClickListener);

        Button btnOoff3 = findViewById(R.id.btnOOFF3);
        btnOoff3.setOnClickListener(onClickListener);

        Button btnOops = findViewById(R.id.btnOOPS);
        btnOops.setOnClickListener(onClickListener);

        Button btnOrders = findViewById(R.id.btnORDERS);
        btnOrders.setOnClickListener(onClickListener);

        Button btnOuch = findViewById(R.id.btnOUCH);
        btnOuch.setOnClickListener(onClickListener);

        Button btnOw1 = findViewById(R.id.btnOW1);
        btnOw1.setOnClickListener(onClickListener);

        Button btnOw2 = findViewById(R.id.btnOW2);
        btnOw2.setOnClickListener(onClickListener);

        Button btnOw3 = findViewById(R.id.btnOW3);
        btnOw3.setOnClickListener(onClickListener);

        Button btnPerfect = findViewById(R.id.btnPERFECT);
        btnPerfect.setOnClickListener(onClickListener);

        Button btnRevenge = findViewById(R.id.btnREVENGE);
        btnRevenge.setOnClickListener(onClickListener);

        Button btnRunaway = findViewById(R.id.btnRUNAWAY);
        btnRunaway.setOnClickListener(onClickListener);

        Button btnStupid = findViewById(R.id.btnSTUPID);
        btnStupid.setOnClickListener(onClickListener);

        Button btnTakeCover = findViewById(R.id.btnTAKECOVER);
        btnTakeCover.setOnClickListener(onClickListener);

        Button btnTraitor = findViewById(R.id.btnTRAITOR);
        btnTraitor.setOnClickListener(onClickListener);

        Button btnUhoh = findViewById(R.id.btnUHOH);
        btnUhoh.setOnClickListener(onClickListener);

        Button btnVictory = findViewById(R.id.btnVICTORY);
        btnVictory.setOnClickListener(onClickListener);

        Button btnWatchthis = findViewById(R.id.btnWATCHTHIS);
        btnWatchthis.setOnClickListener(onClickListener);

        Button btnWhatthe = findViewById(R.id.btnWHATTHE);
        btnWhatthe.setOnClickListener(onClickListener);

        Button btnWobble = findViewById(R.id.btnWOBBLE);
        btnWobble.setOnClickListener(onClickListener);

        Button btnYessir = findViewById(R.id.btnYESSIR);
        btnYessir.setOnClickListener(onClickListener);

        Button btnYoullregretthat = findViewById(R.id.btnYOULLREGRETTHAT);
        btnYoullregretthat.setOnClickListener(onClickListener);



    }


    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnAmazing:
                    playSound(amazing);
                    break;
                case R.id.btnBoring:
                    playSound(boring);
                    break;
                case R.id.btnBrilliant:
                    playSound(brilliant);
                    break;
                case R.id.btnBummer:
                    playSound(bummer);
                    break;
                case R.id.btnBungee:
                    playSound(bungle);
                    break;
                case R.id.btnByebye:
                    playSound(byebye);
                    break;
                case R.id.btnCollect:
                    playSound(collect);
                    break;
                case R.id.btnComeonthen:
                    playSound(comeonthen);
                    break;
                case R.id.btnCoward:
                    playSound(coward);
                    break;
                case R.id.btnDRAGONPUNCH:
                    playSound(dragonpunch);
                    break;
                case R.id.btnDROP:
                    playSound(drop);
                    break;
                case R.id.btnEXCELLENT:
                    playSound(exellent);
                    break;
                case R.id.btnFATALITY:
                    playSound(fatality);
                    break;
                case R.id.btnFIRE:
                    playSound(fire);
                    break;
                case R.id.btnFIREBALL:
                    playSound(fireball);
                    break;
                case R.id.btnFIRSTBLOOD:
                    playSound(firstblood);
                    break;
                case R.id.btnFLAWLESS:
                    playSound(flawless);
                    break;
                case R.id.btnGOAWAY:
                    playSound(goaway);
                    break;
                case R.id.btnHELLO:
                    playSound(hello);
                    break;
                case R.id.btnHURRY:
                    playSound(hurry);
                    break;
                case R.id.btnILLGETYOU:
                    playSound(illgetyou);
                    break;
                case R.id.btnGRENADE:
                    playSound(grenade);
                    break;
                case R.id.btnINCOMING:
                    playSound(incoming);
                    break;
                case R.id.btnJUMP1:
                    playSound(jump1);
                    break;
                case R.id.btnJUMP2:
                    playSound(jump2);
                    break;
                case R.id.btnJUSTYOUWAIT:
                    playSound(justyouwait);
                    break;
                case R.id.btnKAMIKAZE:
                    playSound(kamikaze);
                    break;
                case R.id.btnLAUGH:
                    playSound(laugh);
                    break;
                case R.id.btnLEAVEMEALONE:
                    playSound(leavemealone);
                    break;
                case R.id.btnMISSED:
                    playSound(missed);
                    break;
                case R.id.btnNOOO:
                    playSound(nooo);
                    break;
                case R.id.btnOHDEAR:
                    playSound(ohdear);
                    break;
                case R.id.btnOINUTTER:
                    playSound(grenade);
                    break;
                case R.id.btnOOFF1:
                    playSound(ooff1);
                    break;
                case R.id.btnOOFF2:
                    playSound(ooff2);
                    break;
                case R.id.btnOOFF3:
                    playSound(ooff3);
                    break;
                case R.id.btnOOPS:
                    playSound(oops);
                    break;
                case R.id.btnORDERS:
                    playSound(orders);
                    break;
                case R.id.btnOUCH:
                    playSound(ouch);
                    break;
                case R.id.btnOW1:
                    playSound(ow1);
                    break;
                case R.id.btnOW2:
                    playSound(ow2);
                    break;
                case R.id.btnOW3:
                    playSound(ow3);
                    break;
                case R.id.btnPERFECT:
                    playSound(perfect);
                    break;
                case R.id.btnREVENGE:
                    playSound(revenge);
                    break;
                case R.id.btnRUNAWAY:
                    playSound(runaway);
                    break;
                case R.id.btnSTUPID:
                    playSound(stupid);
                    break;
                case R.id.btnTAKECOVER:
                    playSound(takecover);
                    break;
                case R.id.btnTRAITOR:
                    playSound(traitor);
                    break;
                case R.id.btnUHOH:
                    playSound(uhoh);
                    break;
                case R.id.btnVICTORY:
                    playSound(victoty);
                    break;
                case R.id.btnWATCHTHIS:
                    playSound(watchthis);
                    break;
                case R.id.btnWHATTHE:
                    playSound(whatthe);
                    break;
                case R.id.btnWOBBLE:
                    playSound(wobble);
                    break;
                case R.id.btnYESSIR:
                    playSound(yessir);
                    break;
                case R.id.btnYOULLREGRETTHAT:
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

        amazing = loadSound("AMAZING.WAV");
        boring = loadSound("BORING.WAV");
        brilliant = loadSound("BRILLIANT.WAV");
        bummer = loadSound("BUMMER.WAV");
        bungle = loadSound("BUNGEE.WAV");
        byebye = loadSound("BYEBYE.WAV");
        collect = loadSound("COLLECT.WAV");
        comeonthen = loadSound("COMEONTHEN.WAV");
        coward = loadSound("COWARD.WAV");
        dragonpunch = loadSound("DRAGONPUNCH.WAV");
        drop = loadSound("DROP.WAV");
        exellent = loadSound("EXCELLENT.WAV");
        fatality = loadSound("FATALITY.WAV");
        fire = loadSound("FIRE.WAV");
        fireball = loadSound("FIREBALL.WAV");
        firstblood = loadSound("FIRSTBLOOD.WAV");
        flawless = loadSound("FLAWLESS.WAV");
        goaway = loadSound("GOAWAY.WAV");
        grenade = loadSound("GRENADE.WAV");
        hello = loadSound("HELLO.WAV");
        hurry = loadSound("HURRY.WAV");
        incoming = loadSound("INCOMING.WAV");
        jump1 = loadSound("JUMP1.WAV");
        jump2 = loadSound("JUMP2.WAV");
        justyouwait = loadSound("JUSTYOUWAIT.WAV");
        laugh = loadSound("LAUGH.WAV");
        leavemealone = loadSound("LEAVEMEALONE.WAV");
        missed = loadSound("MISSED.WAV");
        nooo = loadSound("NOOO.WAV");
        ohdear = loadSound("OHDEAR.WAV");
        oinutter = loadSound("OINUTTER.WAV");
        ooff1 = loadSound("OOFF1.WAV");
        ooff2 = loadSound("OOFF2.WAV");
        ooff3 = loadSound("OOFF3.WAV");
        oops = loadSound("OOPS.WAV");
        orders = loadSound("ORDERS.WAV");
        ouch = loadSound("OUCH.WAV");
        ow1 = loadSound("OW1.WAV");
        kamikaze = loadSound("KAMIKAZE.WAV");
        ow2 = loadSound("OW2.WAV");
        ow3 = loadSound("OW3.WAV");
        perfect = loadSound("PERFECT.WAV");
        revenge = loadSound("REVENGE.WAV");
        runaway = loadSound("RUNAWAY.WAV");
        stupid = loadSound("STUPID.WAV");
        takecover = loadSound("TAKECOVER.WAV");
        traitor = loadSound("TRAITOR.WAV");
        uhoh = loadSound("UH-OH.WAV");
        victoty = loadSound("VICTORY.WAV");
        watchthis = loadSound("WATCHTHIS.WAV");
        whatthe = loadSound("WHATTHE.WAV");
        wobble = loadSound("WOBBLE.WAV");
        yessir = loadSound("YESSIR.WAV");
        youllregetthat = loadSound("YOULLREGRETTHAT.WAV");
        illgetyou = loadSound("ILLGETYOU.WAV");
    }
}

