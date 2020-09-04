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

public class sergantworms extends AppCompatActivity {
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
        setContentView(R.layout.activity_sergantworms);
        Button btnAmazing = findViewById(R.id.btnSergantAmazing);
        btnAmazing.setOnClickListener(onClickListener);

        Button btnBoring = findViewById(R.id.btnSergantBoring);
        btnBoring.setOnClickListener(onClickListener);

        Button btnBrilliant = findViewById(R.id.btnSergantBrilliant);
        btnBrilliant.setOnClickListener(onClickListener);

        Button btnBummer = findViewById(R.id.btnSergantBummer);
        btnBummer.setOnClickListener(onClickListener);

        Button btnBungee = findViewById(R.id.btnSergantBungee);
        btnBungee.setOnClickListener(onClickListener);

        Button btnByebye= findViewById(R.id.btnSergantByebye);
        btnByebye.setOnClickListener(onClickListener);

        Button btnCollect = findViewById(R.id.btnSergantCollect);
        btnCollect.setOnClickListener(onClickListener);

        Button btnComeonthen = findViewById(R.id.btnSergantComeonthen);
        btnComeonthen.setOnClickListener(onClickListener);

        Button btnCoward = findViewById(R.id.btnSergantCoward);
        btnCoward.setOnClickListener(onClickListener);

        Button btnDroagonpunch = findViewById(R.id.btnSergantDRAGONPUNCH);
        btnDroagonpunch.setOnClickListener(onClickListener);

        Button btnDrop = findViewById(R.id.btnSergantDROP);
        btnDrop.setOnClickListener(onClickListener);

        Button btnExcellent = findViewById(R.id.btnSergantEXCELLENT);
        btnExcellent.setOnClickListener(onClickListener);

        Button btnFatality = findViewById(R.id.btnSergantFATALITY);
        btnFatality.setOnClickListener(onClickListener);

        Button btnFire = findViewById(R.id.btnSergantFIRE);
        btnFire.setOnClickListener(onClickListener);

        Button btnFireball = findViewById(R.id.btnSergantFIREBALL);
        btnFireball.setOnClickListener(onClickListener);

        Button btnFirstblood = findViewById(R.id.btnSergantFIRSTBLOOD);
        btnFirstblood.setOnClickListener(onClickListener);

        Button btnFlawLess = findViewById(R.id.btnSergantFLAWLESS);
        btnFlawLess.setOnClickListener(onClickListener);

        Button btnGoaway = findViewById(R.id.btnSergantGOAWAY);
        btnGoaway.setOnClickListener(onClickListener);

        Button btnGrenade = findViewById(R.id.btnSergantGRENADE);
        btnGrenade.setOnClickListener(onClickListener);

        Button btnHello = findViewById(R.id.btnSergantHELLO);
        btnHello.setOnClickListener(onClickListener);

        Button btnHurry = findViewById(R.id.btnSergantHURRY);
        btnHurry.setOnClickListener(onClickListener);


        Button btnIncoming = findViewById(R.id.btnSergantINCOMING);
        btnIncoming.setOnClickListener(onClickListener);

        Button btnJump1 = findViewById(R.id.btnSergantJUMP1);
        btnJump1.setOnClickListener(onClickListener);

        Button btnJump2 = findViewById(R.id.btnSergantJUMP2);
        btnJump2.setOnClickListener(onClickListener);

        Button btnJustyouwait = findViewById(R.id.btnSergantJUSTYOUWAIT);
        btnJustyouwait.setOnClickListener(onClickListener);

        Button btnKamikaze = findViewById(R.id.btnSergantKAMIKAZE);
        btnKamikaze.setOnClickListener(onClickListener);

        Button btnLaugh = findViewById(R.id.btnSergantLAUGH);
        btnLaugh.setOnClickListener(onClickListener);

        Button btnLeavemealone = findViewById(R.id.btnSergantLEAVEMEALONE);
        btnLeavemealone.setOnClickListener(onClickListener);

        Button btnMissed = findViewById(R.id.btnSergantMISSED);
        btnMissed.setOnClickListener(onClickListener);

        Button btnNooo = findViewById(R.id.btnSergantNOOO);
        btnNooo.setOnClickListener(onClickListener);

        Button btnOhdear = findViewById(R.id.btnSergantOHDEAR);
        btnOhdear.setOnClickListener(onClickListener);

        Button btnOinutter = findViewById(R.id.btnSergantOINUTTER);
        btnOinutter.setOnClickListener(onClickListener);

        Button btnOoff1 = findViewById(R.id.btnSergantOOFF1);
        btnOoff1.setOnClickListener(onClickListener);

        Button btnOoff2 = findViewById(R.id.btnSergantOOFF2);
        btnOoff2.setOnClickListener(onClickListener);

        Button btnOoff3 = findViewById(R.id.btnSergantOOFF3);
        btnOoff3.setOnClickListener(onClickListener);

        Button btnOops = findViewById(R.id.btnSergantOOPS);
        btnOops.setOnClickListener(onClickListener);

        Button btnOrders = findViewById(R.id.btnSergantORDERS);
        btnOrders.setOnClickListener(onClickListener);

        Button btnOuch = findViewById(R.id.btnSergantOUCH);
        btnOuch.setOnClickListener(onClickListener);

        Button btnOw1 = findViewById(R.id.btnSergantOW1);
        btnOw1.setOnClickListener(onClickListener);

        Button btnOw2 = findViewById(R.id.btnSergantOW2);
        btnOw2.setOnClickListener(onClickListener);

        Button btnOw3 = findViewById(R.id.btnSergantOW3);
        btnOw3.setOnClickListener(onClickListener);

        Button btnPerfect = findViewById(R.id.btnSergantPERFECT);
        btnPerfect.setOnClickListener(onClickListener);

        Button btnRevenge = findViewById(R.id.btnSergantREVENGE);
        btnRevenge.setOnClickListener(onClickListener);

        Button btnRunaway = findViewById(R.id.btnSergantRUNAWAY);
        btnRunaway.setOnClickListener(onClickListener);

        Button btnStupid = findViewById(R.id.btnSergantSTUPID);
        btnStupid.setOnClickListener(onClickListener);

        Button btnTakeCover = findViewById(R.id.btnSergantTAKECOVER);
        btnTakeCover.setOnClickListener(onClickListener);

        Button btnTraitor = findViewById(R.id.btnSergantTRAITOR);
        btnTraitor.setOnClickListener(onClickListener);

        Button btnVictory = findViewById(R.id.btnSergantVICTORY);
        btnVictory.setOnClickListener(onClickListener);

        Button btnWatchthis = findViewById(R.id.btnSergantWATCHTHIS);
        btnWatchthis.setOnClickListener(onClickListener);

        Button btnWhatthe = findViewById(R.id.btnSergantWHATTHE);
        btnWhatthe.setOnClickListener(onClickListener);


        Button btnYessir = findViewById(R.id.btnSergantYESSIR);
        btnYessir.setOnClickListener(onClickListener);

        Button btnYoullregretthat = findViewById(R.id.btnSergantYOULLREGRETTHAT);
        btnYoullregretthat.setOnClickListener(onClickListener);



    }


    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnSergantAmazing:
                    playSound(amazing);
                    break;
                case R.id.btnSergantBoring:
                    playSound(boring);
                    break;
                case R.id.btnSergantBrilliant:
                    playSound(brilliant);
                    break;
                case R.id.btnSergantBummer:
                    playSound(bummer);
                    break;
                case R.id.btnSergantBungee:
                    playSound(bungle);
                    break;
                case R.id.btnSergantByebye:
                    playSound(byebye);
                    break;
                case R.id.btnSergantCollect:
                    playSound(collect);
                    break;
                case R.id.btnSergantComeonthen:
                    playSound(comeonthen);
                    break;
                case R.id.btnSergantCoward:
                    playSound(coward);
                    break;
                case R.id.btnSergantDRAGONPUNCH:
                    playSound(dragonpunch);
                    break;
                case R.id.btnSergantDROP:
                    playSound(drop);
                    break;
                case R.id.btnSergantEXCELLENT:
                    playSound(exellent);
                    break;
                case R.id.btnSergantFATALITY:
                    playSound(fatality);
                    break;
                case R.id.btnSergantFIRE:
                    playSound(fire);
                    break;
                case R.id.btnSergantFIREBALL:
                    playSound(fireball);
                    break;
                case R.id.btnSergantFIRSTBLOOD:
                    playSound(firstblood);
                    break;
                case R.id.btnSergantFLAWLESS:
                    playSound(flawless);
                    break;
                case R.id.btnSergantGOAWAY:
                    playSound(goaway);
                    break;
                case R.id.btnSergantHELLO:
                    playSound(hello);
                    break;
                case R.id.btnSergantHURRY:
                    playSound(hurry);
                    break;
                case R.id.btnSergantGRENADE:
                    playSound(grenade);
                    break;
                case R.id.btnSergantINCOMING:
                    playSound(incoming);
                    break;
                case R.id.btnSergantJUMP1:
                    playSound(jump1);
                    break;
                case R.id.btnSergantJUMP2:
                    playSound(jump2);
                    break;
                case R.id.btnSergantJUSTYOUWAIT:
                    playSound(justyouwait);
                    break;
                case R.id.btnSergantKAMIKAZE:
                    playSound(kamikaze);
                    break;
                case R.id.btnSergantLAUGH:
                    playSound(laugh);
                    break;
                case R.id.btnSergantLEAVEMEALONE:
                    playSound(leavemealone);
                    break;
                case R.id.btnSergantMISSED:
                    playSound(missed);
                    break;
                case R.id.btnSergantNOOO:
                    playSound(nooo);
                    break;
                case R.id.btnSergantOHDEAR:
                    playSound(ohdear);
                    break;
                case R.id.btnSergantOINUTTER:
                    playSound(grenade);
                    break;
                case R.id.btnSergantOOFF1:
                    playSound(ooff1);
                    break;
                case R.id.btnSergantOOFF2:
                    playSound(ooff2);
                    break;
                case R.id.btnSergantOOFF3:
                    playSound(ooff3);
                    break;
                case R.id.btnSergantOOPS:
                    playSound(oops);
                    break;
                case R.id.btnSergantORDERS:
                    playSound(orders);
                    break;
                case R.id.btnSergantOUCH:
                    playSound(ouch);
                    break;
                case R.id.btnSergantOW1:
                    playSound(ow1);
                    break;
                case R.id.btnSergantOW2:
                    playSound(ow2);
                    break;
                case R.id.btnSergantOW3:
                    playSound(ow3);
                    break;
                case R.id.btnSergantPERFECT:
                    playSound(perfect);
                    break;
                case R.id.btnSergantREVENGE:
                    playSound(revenge);
                    break;
                case R.id.btnSergantRUNAWAY:
                    playSound(runaway);
                    break;
                case R.id.btnSergantSTUPID:
                    playSound(stupid);
                    break;
                case R.id.btnSergantTAKECOVER:
                    playSound(takecover);
                    break;
                case R.id.btnSergantTRAITOR:
                    playSound(traitor);
                    break;

                case R.id.btnSergantVICTORY:
                    playSound(victoty);
                    break;
                case R.id.btnSergantWATCHTHIS:
                    playSound(watchthis);
                    break;
                case R.id.btnSergantWHATTHE:
                    playSound(whatthe);
                    break;
                case R.id.btnSergantYESSIR:
                    playSound(yessir);
                    break;
                case R.id.btnSergantYOULLREGRETTHAT:
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

        amazing = loadSound("Sergantamazing.wav");
        boring = loadSound("Sergantboring.wav");
        brilliant = loadSound("Sergantbrilliant.wav");
        bummer = loadSound("Sergantbummer.wav");
        bungle = loadSound("Sergantbungee.wav");
        byebye = loadSound("Sergantbyebye.wav");
        collect = loadSound("Sergantcollect.wav");
        comeonthen = loadSound("Sergantcomeonthen.wav");
        coward = loadSound("Sergantcoward.wav");
        dragonpunch = loadSound("Sergantdragonpunch.wav");
        drop = loadSound("Sergantdrop.wav");
        exellent = loadSound("Sergantexcellent.wav");
        fatality = loadSound("Sergantfatality.wav");
        fire = loadSound("Sergantfire.wav");
        fireball = loadSound("Sergantfireball.wav");
        firstblood = loadSound("Sergantfirstblood.wav");
        flawless = loadSound("Sergantflawless.wav");
        goaway = loadSound("Sergantgoaway.wav");
        grenade = loadSound("Sergantgrenade.wav");
        hello = loadSound("Serganthello.wav");
        hurry = loadSound("Serganthurry.wav");
        incoming = loadSound("Sergantincoming.wav");
        jump1 = loadSound("Sergantjump1.wav");
        jump2 = loadSound("Sergantjump2.wav");
        justyouwait = loadSound("Sergantjustyouwait.wav");
        laugh = loadSound("Sergantlaugh.wav");
        leavemealone = loadSound("Sergantleavemealone.wav");
        missed = loadSound("Sergantmissed.wav");
        nooo = loadSound("Sergantnooo.wav");
        ohdear = loadSound("Sergantohdear.wav");
        oinutter = loadSound("Sergantoinutter.wav");
        ooff1 = loadSound("Sergantoof1.wav");
        ooff2 = loadSound("Sergantoof2.wav");
        ooff3 = loadSound("Sergantoof3.wav");
        oops = loadSound("Sergantoops.wav");
        orders = loadSound("Sergantorders.wav");
        ouch = loadSound("Sergantouch.wav");
        ow1 = loadSound("Sergantow1.wav");
        kamikaze = loadSound("Sergantkamikaze.wav");
        ow2 = loadSound("Sergantow2.wav");
        ow3 = loadSound("Sergantow3.wav");
        perfect = loadSound("Sergantperfect.wav");
        revenge = loadSound("Sergantrevenge.wav");
        runaway = loadSound("Sergantrunaway.wav");
        stupid = loadSound("Sergantstupid.wav");
        takecover = loadSound("Serganttakecover.wav");
        traitor = loadSound("Serganttraitor.wav");
        uhoh = loadSound("Sergantuhoh.wav");
        victoty = loadSound("Sergantvictory.wav");
        watchthis = loadSound("Sergantwatchthis.wav");
        whatthe = loadSound("Sergantwhatthe.wav");
        wobble = loadSound("WOBBLE.WAV");
        yessir = loadSound("Sergantyessir.wav");
        youllregetthat = loadSound("Sergantyoullregretthat.wav");
        illgetyou = loadSound("ILLGETYOU.WAV");










    }
}
