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

public class dutchworm extends AppCompatActivity {

    public SoundPool mSoundPool;
    public AssetManager mAssetManager;
    public int mStreamID;
    public int dutchamazing;
    public int dutchboring;
    private int dutchbrilliant;
    private int dutchbummer;
    private int dutchbungle;
    private int dutchbyebye;
    private int dutchcollect;
    private int dutchcomeonthen;
    private int dutchcoward;
    private int dutchdragonpunch;
    private int dutchdrop;
    private int dutchexellent;
    private int dutchfatality;
    private int dutchfire;
    private int dutchfireball;
    private int dutchfirstblood;
    private int dutchflawless;
    private int dutchgoaway;
    private int dutchgrenade;
    private int dutchhello;
    private int dutchhurry;
    private int dutchillgetyou;
    private int dutchincoming;
    private int dutchjump1;
    private int dutchjump2;
    private int dutchjustyouwait;
    private int dutchkamikaze;
    private int dutchlaugh;
    private int dutchleavemealone;
    private int dutchmissed;
    private int dutchnooo;
    private int dutchohdear;
    public int dutchoinutter;
    public int dutchooff1;
    public int dutchooff2;
    public int dutchooff3;
    public int dutchoops;
    public int dutchorders;
    public int dutchouch;
    public int dutchow1;
    public int dutchow2;
    public int dutchow3;
    public int dutchperfect;
    public int dutchrevenge;
    public int dutchrunaway;
    public int dutchstupid;
    public int dutchtakecover;
    public int dutchtraitor;
    public int dutchuhoh;
    public int dutchvictoty;
    public int dutchwatchthis;
    public int dutchwhatthe;
    public int dutchwobble;
    public int dutchyessir;
    public int dutchyoullregetthat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dutchworm);
        Button btnAmazing = findViewById(R.id.btnDutchAmazing);
        btnAmazing.setOnClickListener(onClickListener);

        Button btnBoring = findViewById(R.id.btnDutchBoring);
        btnBoring.setOnClickListener(onClickListener);

        Button btnBrilliant = findViewById(R.id.btnDutchBrilliant);
        btnBrilliant.setOnClickListener(onClickListener);

        Button btnBummer = findViewById(R.id.btnDutchBummer);
        btnBummer.setOnClickListener(onClickListener);

        Button btnBungee = findViewById(R.id.btnDutchBungee);
        btnBungee.setOnClickListener(onClickListener);

        Button btnByebye= findViewById(R.id.btnDutchByebye);
        btnByebye.setOnClickListener(onClickListener);

        Button btnCollect = findViewById(R.id.btnDutchCollect);
        btnCollect.setOnClickListener(onClickListener);

        Button btnComeonthen = findViewById(R.id.btnDutchComeonthen);
        btnComeonthen.setOnClickListener(onClickListener);

        Button btnCoward = findViewById(R.id.btnDutchCoward);
        btnCoward.setOnClickListener(onClickListener);

        Button btnDroagonpunch = findViewById(R.id.btnDutchDRAGONPUNCH);
        btnDroagonpunch.setOnClickListener(onClickListener);

        Button btnDrop = findViewById(R.id.btnDutchDROP);
        btnDrop.setOnClickListener(onClickListener);

        Button btnExcellent = findViewById(R.id.btnDutchEXCELLENT);
        btnExcellent.setOnClickListener(onClickListener);

        Button btnFatality = findViewById(R.id.btnDutchFATALITY);
        btnFatality.setOnClickListener(onClickListener);

        Button btnFire = findViewById(R.id.btnDutchFIRE);
        btnFire.setOnClickListener(onClickListener);

        Button btnFireball = findViewById(R.id.btnDutchFIREBALL);
        btnFireball.setOnClickListener(onClickListener);

        Button btnFirstblood = findViewById(R.id.btnDutchFIRSTBLOOD);
        btnFirstblood.setOnClickListener(onClickListener);

        Button btnFlawLess = findViewById(R.id.btnDutchFLAWLESS);
        btnFlawLess.setOnClickListener(onClickListener);

        Button btnGoaway = findViewById(R.id.btnDutchGOAWAY);
        btnGoaway.setOnClickListener(onClickListener);

        Button btnGrenade = findViewById(R.id.btnDutchGRENADE);
        btnGrenade.setOnClickListener(onClickListener);

        Button btnHello = findViewById(R.id.btnDutchHELLO);
        btnHello.setOnClickListener(onClickListener);

        Button btnHurry = findViewById(R.id.btnDutchHURRY);
        btnHurry.setOnClickListener(onClickListener);

        Button btnIllegetyou = findViewById(R.id.btnDutchILLGETYOU);
        btnIllegetyou.setOnClickListener(onClickListener);

        Button btnIncoming = findViewById(R.id.btnDutchINCOMING);
        btnIncoming.setOnClickListener(onClickListener);

        Button btnJump1 = findViewById(R.id.btnDutchJUMP1);
        btnJump1.setOnClickListener(onClickListener);

        Button btnJump2 = findViewById(R.id.btnDutchJUMP2);
        btnJump2.setOnClickListener(onClickListener);

        Button btnJustyouwait = findViewById(R.id.btnDutchJUSTYOUWAIT);
        btnJustyouwait.setOnClickListener(onClickListener);

        Button btnKamikaze = findViewById(R.id.btnDutchKAMIKAZE);
        btnKamikaze.setOnClickListener(onClickListener);

        Button btnLaugh = findViewById(R.id.btnDutchLAUGH);
        btnLaugh.setOnClickListener(onClickListener);

        Button btnLeavemealone = findViewById(R.id.btnDutchLEAVEMEALONE);
        btnLeavemealone.setOnClickListener(onClickListener);

        Button btnMissed = findViewById(R.id.btnDutchMISSED);
        btnMissed.setOnClickListener(onClickListener);

        Button btnNooo = findViewById(R.id.btnDutchNOOO);
        btnNooo.setOnClickListener(onClickListener);

        Button btnOhdear = findViewById(R.id.btnDutchOHDEAR);
        btnOhdear.setOnClickListener(onClickListener);

        Button btnOinutter = findViewById(R.id.btnDutchOINUTTER);
        btnOinutter.setOnClickListener(onClickListener);

        Button btnOoff1 = findViewById(R.id.btnDutchOOFF1);
        btnOoff1.setOnClickListener(onClickListener);

        Button btnOoff2 = findViewById(R.id.btnDutchOOFF2);
        btnOoff2.setOnClickListener(onClickListener);

        Button btnOoff3 = findViewById(R.id.btnDutchOOFF3);
        btnOoff3.setOnClickListener(onClickListener);

        Button btnOops = findViewById(R.id.btnDutchOOPS);
        btnOops.setOnClickListener(onClickListener);

        Button btnOrders = findViewById(R.id.btnDutchORDERS);
        btnOrders.setOnClickListener(onClickListener);

        Button btnOuch = findViewById(R.id.btnDutchOUCH);
        btnOuch.setOnClickListener(onClickListener);

        Button btnOw1 = findViewById(R.id.btnDutchOW1);
        btnOw1.setOnClickListener(onClickListener);

        Button btnOw2 = findViewById(R.id.btnDutchOW2);
        btnOw2.setOnClickListener(onClickListener);

        Button btnOw3 = findViewById(R.id.btnDutchOW3);
        btnOw3.setOnClickListener(onClickListener);

        Button btnPerfect = findViewById(R.id.btnDutchPERFECT);
        btnPerfect.setOnClickListener(onClickListener);

        Button btnRevenge = findViewById(R.id.btnDutchREVENGE);
        btnRevenge.setOnClickListener(onClickListener);

        Button btnRunaway = findViewById(R.id.btnDutchRUNAWAY);
        btnRunaway.setOnClickListener(onClickListener);

        Button btnStupid = findViewById(R.id.btnDutchSTUPID);
        btnStupid.setOnClickListener(onClickListener);

        Button btnTakeCover = findViewById(R.id.btnDutchTAKECOVER);
        btnTakeCover.setOnClickListener(onClickListener);

        Button btnTraitor = findViewById(R.id.btnDutchTRAITOR);
        btnTraitor.setOnClickListener(onClickListener);

        Button btnUhoh = findViewById(R.id.btnDutchUHOH);
        btnUhoh.setOnClickListener(onClickListener);

        Button btnVictory = findViewById(R.id.btnDutchVICTORY);
        btnVictory.setOnClickListener(onClickListener);

        Button btnWatchthis = findViewById(R.id.btnDutchWATCHTHIS);
        btnWatchthis.setOnClickListener(onClickListener);

        Button btnWhatthe = findViewById(R.id.btnDutchWHATTHE);
        btnWhatthe.setOnClickListener(onClickListener);

        Button btnWobble = findViewById(R.id.btnDutchWOBBLE);
        btnWobble.setOnClickListener(onClickListener);

        Button btnYessir = findViewById(R.id.btnDutchYESSIR);
        btnYessir.setOnClickListener(onClickListener);

        Button btnYoullregretthat = findViewById(R.id.btnDutchYOULLREGRETTHAT);
        btnYoullregretthat.setOnClickListener(onClickListener);



    }


    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnDutchAmazing:
                    playSound(dutchamazing);
                    break;
                case R.id.btnDutchBoring:
                    playSound(dutchboring);
                    break;
                case R.id.btnDutchBrilliant:
                    playSound(dutchbrilliant);
                    break;
                case R.id.btnDutchBummer:
                    playSound(dutchbummer);
                    break;
                case R.id.btnDutchBungee:
                    playSound(dutchbungle);
                    break;
                case R.id.btnDutchByebye:
                    playSound(dutchbyebye);
                    break;
                case R.id.btnDutchCollect:
                    playSound(dutchcollect);
                    break;
                case R.id.btnDutchComeonthen:
                    playSound(dutchcomeonthen);
                    break;
                case R.id.btnDutchCoward:
                    playSound(dutchcoward);
                    break;
                case R.id.btnDutchDRAGONPUNCH:
                    playSound(dutchdragonpunch);
                    break;
                case R.id.btnDutchDROP:
                    playSound(dutchdrop);
                    break;
                case R.id.btnDutchEXCELLENT:
                    playSound(dutchexellent);
                    break;
                case R.id.btnDutchFATALITY:
                    playSound(dutchfatality);
                    break;
                case R.id.btnDutchFIRE:
                    playSound(dutchfire);
                    break;
                case R.id.btnDutchFIREBALL:
                    playSound(dutchfireball);
                    break;
                case R.id.btnDutchFIRSTBLOOD:
                    playSound(dutchfirstblood);
                    break;
                case R.id.btnDutchFLAWLESS:
                    playSound(dutchflawless);
                    break;
                case R.id.btnDutchGOAWAY:
                    playSound(dutchgoaway);
                    break;
                case R.id.btnDutchHELLO:
                    playSound(dutchhello);
                    break;
                case R.id.btnDutchHURRY:
                    playSound(dutchhurry);
                    break;
                case R.id.btnDutchILLGETYOU:
                    playSound(dutchillgetyou);
                    break;
                case R.id.btnDutchGRENADE:
                    playSound(dutchgrenade);
                    break;
                case R.id.btnDutchINCOMING:
                    playSound(dutchincoming);
                    break;
                case R.id.btnDutchJUMP1:
                    playSound(dutchjump1);
                    break;
                case R.id.btnDutchJUMP2:
                    playSound(dutchjump2);
                    break;
                case R.id.btnDutchJUSTYOUWAIT:
                    playSound(dutchjustyouwait);
                    break;
                case R.id.btnDutchKAMIKAZE:
                    playSound(dutchkamikaze);
                    break;
                case R.id.btnDutchLAUGH:
                    playSound(dutchlaugh);
                    break;
                case R.id.btnDutchLEAVEMEALONE:
                    playSound(dutchleavemealone);
                    break;
                case R.id.btnMISSED:
                    playSound(dutchmissed);
                    break;
                case R.id.btnDutchNOOO:
                    playSound(dutchnooo);
                    break;
                case R.id.btnDutchOHDEAR:
                    playSound(dutchohdear);
                    break;
                case R.id.btnDutchOINUTTER:
                    playSound(dutchgrenade);
                    break;
                case R.id.btnDutchOOFF1:
                    playSound(dutchooff1);
                    break;
                case R.id.btnDutchOOFF2:
                    playSound(dutchooff2);
                    break;
                case R.id.btnDutchOOFF3:
                    playSound(dutchooff3);
                    break;
                case R.id.btnDutchOOPS:
                    playSound(dutchoops);
                    break;
                case R.id.btnDutchORDERS:
                    playSound(dutchorders);
                    break;
                case R.id.btnDutchOUCH:
                    playSound(dutchouch);
                    break;
                case R.id.btnDutchOW1:
                    playSound(dutchow1);
                    break;
                case R.id.btnDutchOW2:
                    playSound(dutchow2);
                    break;
                case R.id.btnDutchOW3:
                    playSound(dutchow3);
                    break;
                case R.id.btnDutchPERFECT:
                    playSound(dutchperfect);
                    break;
                case R.id.btnDutchREVENGE:
                    playSound(dutchrevenge);
                    break;
                case R.id.btnDutchRUNAWAY:
                    playSound(dutchrunaway);
                    break;
                case R.id.btnDutchSTUPID:
                    playSound(dutchstupid);
                    break;
                case R.id.btnDutchTAKECOVER:
                    playSound(dutchtakecover);
                    break;
                case R.id.btnDutchTRAITOR:
                    playSound(dutchtraitor);
                    break;
                case R.id.btnDutchUHOH:
                    playSound(dutchuhoh);
                    break;
                case R.id.btnDutchVICTORY:
                    playSound(dutchvictoty);
                    break;
                case R.id.btnDutchWATCHTHIS:
                    playSound(dutchwatchthis);
                    break;
                case R.id.btnDutchWHATTHE:
                    playSound(dutchwhatthe);
                    break;
                case R.id.btnDutchWOBBLE:
                    playSound(dutchwobble);
                    break;
                case R.id.btnDutchYESSIR:
                    playSound(dutchyessir);
                    break;
                case R.id.btnDutchYOULLREGRETTHAT:
                    playSound(dutchyoullregetthat);
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

        dutchamazing = loadSound("DutchAMAZING.WAV");
        dutchboring = loadSound("DutchBORING.WAV");
        dutchbrilliant = loadSound("DutchBRILLIANT.WAV");
        dutchbummer = loadSound("DutchBUMMER.WAV");
        dutchbungle = loadSound("DutchBUNGEE.WAV");
        dutchbyebye = loadSound("DutchBYEBYE.WAV");
        dutchcollect = loadSound("DutchCOLLECT.WAV");
        dutchcomeonthen = loadSound("DutchCOMEONTHEN.WAV");
        dutchcoward = loadSound("DutchCOWARD.WAV");
        dutchdragonpunch = loadSound("DutchDRAGONPUNCH.WAV");
        dutchdrop = loadSound("DutchDROP.WAV");
        dutchexellent = loadSound("DutchEXCELLENT.WAV");
        dutchfatality = loadSound("DutchFATALITY.WAV");
        dutchfire = loadSound("DutchFIRE.WAV");
        dutchfireball = loadSound("DutchFIREBALL.WAV");
        dutchfirstblood = loadSound("DutchFIRSTBLOOD.WAV");
        dutchflawless = loadSound("DutchFLAWLESS.WAV");
        dutchgoaway = loadSound("DutchGOAWAY.WAV");
        dutchgrenade = loadSound("DutchGRENADE.WAV");
        dutchhello = loadSound("DutchHELLO.WAV");
        dutchhurry = loadSound("DutchHURRY.WAV");
        dutchincoming = loadSound("DutchINCOMING.WAV");
        dutchjump1 = loadSound("DutchJUMP1.WAV");
        dutchjump2 = loadSound("DutchJUMP2.WAV");
        dutchjustyouwait = loadSound("DutchJUSTYOUWAIT.WAV");
        dutchlaugh = loadSound("DutchLAUGH.WAV");
        dutchleavemealone = loadSound("DutchLEAVEMEALONE.WAV");
        dutchmissed = loadSound("DutchMISSED.WAV");
        dutchnooo = loadSound("DutchNOOO.WAV");
        dutchohdear = loadSound("DutchOHDEAR.WAV");
        dutchoinutter = loadSound("DutchOINUTTER.WAV");
        dutchooff1 = loadSound("DutchOOFF1.WAV");
        dutchooff2 = loadSound("DutchOOFF2.WAV");
        dutchooff3 = loadSound("DutchOOFF3.WAV");
        dutchoops = loadSound("DutchOOPS.WAV");
        dutchorders = loadSound("DutchORDERS.WAV");
        dutchouch = loadSound("DutchOUCH.WAV");
        dutchow1 = loadSound("DutchOW1.WAV");
        dutchkamikaze = loadSound("DutchKAMIKAZE.WAV");
        dutchow2 = loadSound("DutchOW2.WAV");
        dutchow3 = loadSound("DutchOW3.WAV");
        dutchperfect = loadSound("DutchPERFECT.WAV");
        dutchrevenge = loadSound("DutchREVENGE.WAV");
        dutchrunaway = loadSound("DutchRUNAWAY.WAV");
        dutchstupid = loadSound("DutchSTUPID.WAV");
        dutchtakecover = loadSound("DutchTAKECOVER.WAV");
        dutchtraitor = loadSound("DutchTRAITOR.WAV");
        dutchuhoh = loadSound("DutchUH-OH.WAV");
        dutchvictoty = loadSound("DutchVICTORY.WAV");
        dutchwatchthis = loadSound("DutchWATCHTHIS.WAV");
        dutchwhatthe = loadSound("DutchWHATTHE.WAV");
        dutchwobble = loadSound("DutchWOBBLE.WAV");
        dutchyessir = loadSound("DutchYESSIR.WAV");
        dutchyoullregetthat = loadSound("DutchYOULLREGRETTHAT.WAV");
        dutchillgetyou = loadSound("DutchILLGETYOU.WAV");
    }
}