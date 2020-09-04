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

public class wackyworms extends AppCompatActivity {
    public SoundPool mSoundPool;
    public AssetManager mAssetManager;
    public int mStreamID;
    public int wackyamazing;
    public int wackyboring;
    private int wackybrilliant;
    private int wackybummer;
    private int wackybungle;
    private int wackybyebye;
    private int wackycollect;
    private int wackycomeonthen;
    private int wackycoward;
    private int wackydragonpunch;
    private int wackydrop;
    private int wackyexellent;
    private int wackyfatality;
    private int wackyfire;
    private int wackyfireball;
    private int wackyfirstblood;
    private int wackyflawless;
    private int wackygoaway;
    private int wackygrenade;
    private int wackyhello;
    private int wackyhurry;
    private int wackyillgetyou;
    private int wackyincoming;
    private int wackyjump1;
    private int wackyjump2;
    private int wackyjustyouwait;
    private int wackykamikaze;
    private int wackylaugh;
    private int wackyleavemealone;
    private int wackymissed;
    private int wackynooo;
    private int wackyohdear;
    public int wackyoinutter;
    public int wackyooff1;
    public int wackyooff2;
    public int wackyooff3;
    public int wackyoops;
    public int wackyorders;
    public int wackyouch;
    public int wackyow1;
    public int wackyow2;
    public int wackyow3;
    public int wackyperfect;
    public int wackyrevenge;
    public int wackyrunaway;
    public int wackystupid;
    public int wackytakecover;
    public int wackytraitor;
    public int wackyuhoh;
    public int wackyvictoty;
    public int wackywatchthis;
    public int wackywhatthe;
    public int wackywobble;
    public int wackyyessir;
    public int wackyyoullregetthat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wackyworms);
        Button btnAmazing = findViewById(R.id.btnWackyAmazing);
        btnAmazing.setOnClickListener(onClickListener);

        Button btnBoring = findViewById(R.id.btnWackyBoring);
        btnBoring.setOnClickListener(onClickListener);

        Button btnBrilliant = findViewById(R.id.btnWackyBrilliant);
        btnBrilliant.setOnClickListener(onClickListener);

        Button btnBummer = findViewById(R.id.btnWackyBummer);
        btnBummer.setOnClickListener(onClickListener);

        Button btnBungee = findViewById(R.id.btnWackyBungee);
        btnBungee.setOnClickListener(onClickListener);

        Button btnByebye= findViewById(R.id.btnWackyByebye);
        btnByebye.setOnClickListener(onClickListener);

        Button btnCollect = findViewById(R.id.btnWackyCollect);
        btnCollect.setOnClickListener(onClickListener);

        Button btnComeonthen = findViewById(R.id.btnWackyComeonthen);
        btnComeonthen.setOnClickListener(onClickListener);

        Button btnCoward = findViewById(R.id.btnWackyCoward);
        btnCoward.setOnClickListener(onClickListener);

        Button btnDroagonpunch = findViewById(R.id.btnWackyDRAGONPUNCH);
        btnDroagonpunch.setOnClickListener(onClickListener);

        Button btnDrop = findViewById(R.id.btnWackyDROP);
        btnDrop.setOnClickListener(onClickListener);

        Button btnExcellent = findViewById(R.id.btnWackyEXCELLENT);
        btnExcellent.setOnClickListener(onClickListener);

        Button btnFatality = findViewById(R.id.btnWackyFATALITY);
        btnFatality.setOnClickListener(onClickListener);

        Button btnFire = findViewById(R.id.btnWackyFIRE);
        btnFire.setOnClickListener(onClickListener);

        Button btnFireball = findViewById(R.id.btnWackyFIREBALL);
        btnFireball.setOnClickListener(onClickListener);

        Button btnFirstblood = findViewById(R.id.btnWackyFIRSTBLOOD);
        btnFirstblood.setOnClickListener(onClickListener);

        Button btnFlawLess = findViewById(R.id.btnWackyFLAWLESS);
        btnFlawLess.setOnClickListener(onClickListener);

        Button btnGoaway = findViewById(R.id.btnWackyGOAWAY);
        btnGoaway.setOnClickListener(onClickListener);

        Button btnGrenade = findViewById(R.id.btnWackyGRENADE);
        btnGrenade.setOnClickListener(onClickListener);

        Button btnHello = findViewById(R.id.btnWackyHELLO);
        btnHello.setOnClickListener(onClickListener);

        Button btnHurry = findViewById(R.id.btnWackyHURRY);
        btnHurry.setOnClickListener(onClickListener);

        Button btnIllegetyou = findViewById(R.id.btnWackyILLGETYOU);
        btnIllegetyou.setOnClickListener(onClickListener);

        Button btnIncoming = findViewById(R.id.btnWackyINCOMING);
        btnIncoming.setOnClickListener(onClickListener);

        Button btnJump1 = findViewById(R.id.btnWackyJUMP1);
        btnJump1.setOnClickListener(onClickListener);

        Button btnJump2 = findViewById(R.id.btnWackyJUMP2);
        btnJump2.setOnClickListener(onClickListener);

        Button btnJustyouwait = findViewById(R.id.btnWackyJUSTYOUWAIT);
        btnJustyouwait.setOnClickListener(onClickListener);

        Button btnKamikaze = findViewById(R.id.btnWackyKAMIKAZE);
        btnKamikaze.setOnClickListener(onClickListener);

        Button btnLaugh = findViewById(R.id.btnWackyLAUGH);
        btnLaugh.setOnClickListener(onClickListener);

        Button btnLeavemealone = findViewById(R.id.btnWackyLEAVEMEALONE);
        btnLeavemealone.setOnClickListener(onClickListener);

        Button btnMissed = findViewById(R.id.btnWackyMISSED);
        btnMissed.setOnClickListener(onClickListener);

        Button btnNooo = findViewById(R.id.btnWackyNOOO);
        btnNooo.setOnClickListener(onClickListener);

        Button btnOhdear = findViewById(R.id.btnWackyOHDEAR);
        btnOhdear.setOnClickListener(onClickListener);

        Button btnOinutter = findViewById(R.id.btnWackyOINUTTER);
        btnOinutter.setOnClickListener(onClickListener);

        Button btnOoff1 = findViewById(R.id.btnWackyOOFF1);
        btnOoff1.setOnClickListener(onClickListener);

        Button btnOoff2 = findViewById(R.id.btnWackyOOFF2);
        btnOoff2.setOnClickListener(onClickListener);

        Button btnOoff3 = findViewById(R.id.btnWackyOOFF3);
        btnOoff3.setOnClickListener(onClickListener);

        Button btnOops = findViewById(R.id.btnWackyOOPS);
        btnOops.setOnClickListener(onClickListener);

        Button btnOrders = findViewById(R.id.btnWackyORDERS);
        btnOrders.setOnClickListener(onClickListener);

        Button btnOuch = findViewById(R.id.btnWackyOUCH);
        btnOuch.setOnClickListener(onClickListener);

        Button btnOw1 = findViewById(R.id.btnWackyOW1);
        btnOw1.setOnClickListener(onClickListener);

        Button btnOw2 = findViewById(R.id.btnWackyOW2);
        btnOw2.setOnClickListener(onClickListener);

        Button btnOw3 = findViewById(R.id.btnWackyOW3);
        btnOw3.setOnClickListener(onClickListener);

        Button btnPerfect = findViewById(R.id.btnWackyPERFECT);
        btnPerfect.setOnClickListener(onClickListener);

        Button btnRevenge = findViewById(R.id.btnWackyREVENGE);
        btnRevenge.setOnClickListener(onClickListener);

        Button btnRunaway = findViewById(R.id.btnWackyRUNAWAY);
        btnRunaway.setOnClickListener(onClickListener);

        Button btnStupid = findViewById(R.id.btnWackySTUPID);
        btnStupid.setOnClickListener(onClickListener);

        Button btnTakeCover = findViewById(R.id.btnWackyTAKECOVER);
        btnTakeCover.setOnClickListener(onClickListener);

        Button btnTraitor = findViewById(R.id.btnWackyTRAITOR);
        btnTraitor.setOnClickListener(onClickListener);

        Button btnUhoh = findViewById(R.id.btnWackyUHOH);
        btnUhoh.setOnClickListener(onClickListener);

        Button btnVictory = findViewById(R.id.btnWackyVICTORY);
        btnVictory.setOnClickListener(onClickListener);

        Button btnWatchthis = findViewById(R.id.btnWackyWATCHTHIS);
        btnWatchthis.setOnClickListener(onClickListener);

        Button btnWhatthe = findViewById(R.id.btnWackyWHATTHE);
        btnWhatthe.setOnClickListener(onClickListener);

        Button btnWobble = findViewById(R.id.btnWackyWOBBLE);
        btnWobble.setOnClickListener(onClickListener);

        Button btnYessir = findViewById(R.id.btnWackyYESSIR);
        btnYessir.setOnClickListener(onClickListener);

        Button btnYoullregretthat = findViewById(R.id.btnWackyYOULLREGRETTHAT);
        btnYoullregretthat.setOnClickListener(onClickListener);



    }


    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnWackyAmazing:
                    playSound(wackyamazing);
                    break;
                case R.id.btnWackyBoring:
                    playSound(wackyboring);
                    break;
                case R.id.btnWackyBrilliant:
                    playSound(wackybrilliant);
                    break;
                case R.id.btnWackyBummer:
                    playSound(wackybummer);
                    break;
                case R.id.btnWackyBungee:
                    playSound(wackybungle);
                    break;
                case R.id.btnWackyByebye:
                    playSound(wackybyebye);
                    break;
                case R.id.btnWackyCollect:
                    playSound(wackycollect);
                    break;
                case R.id.btnWackyComeonthen:
                    playSound(wackycomeonthen);
                    break;
                case R.id.btnWackyCoward:
                    playSound(wackycoward);
                    break;
                case R.id.btnWackyDRAGONPUNCH:
                    playSound(wackydragonpunch);
                    break;
                case R.id.btnWackyDROP:
                    playSound(wackydrop);
                    break;
                case R.id.btnWackyEXCELLENT:
                    playSound(wackyexellent);
                    break;
                case R.id.btnWackyFATALITY:
                    playSound(wackyfatality);
                    break;
                case R.id.btnWackyFIRE:
                    playSound(wackyfire);
                    break;
                case R.id.btnWackyFIREBALL:
                    playSound(wackyfireball);
                    break;
                case R.id.btnWackyFIRSTBLOOD:
                    playSound(wackyfirstblood);
                    break;
                case R.id.btnWackyFLAWLESS:
                    playSound(wackyflawless);
                    break;
                case R.id.btnWackyGOAWAY:
                    playSound(wackygoaway);
                    break;
                case R.id.btnWackyHELLO:
                    playSound(wackyhello);
                    break;
                case R.id.btnWackyHURRY:
                    playSound(wackyhurry);
                    break;
                case R.id.btnWackyILLGETYOU:
                    playSound(wackyillgetyou);
                    break;
                case R.id.btnWackyGRENADE:
                    playSound(wackygrenade);
                    break;
                case R.id.btnWackyINCOMING:
                    playSound(wackyincoming);
                    break;
                case R.id.btnWackyJUMP1:
                    playSound(wackyjump1);
                    break;
                case R.id.btnWackyJUMP2:
                    playSound(wackyjump2);
                    break;
                case R.id.btnWackyJUSTYOUWAIT:
                    playSound(wackyjustyouwait);
                    break;
                case R.id.btnWackyKAMIKAZE:
                    playSound(wackykamikaze);
                    break;
                case R.id.btnWackyLAUGH:
                    playSound(wackylaugh);
                    break;
                case R.id.btnWackyLEAVEMEALONE:
                    playSound(wackyleavemealone);
                    break;
                case R.id.btnWackyMISSED:
                    playSound(wackymissed);
                    break;
                case R.id.btnWackyNOOO:
                    playSound(wackynooo);
                    break;
                case R.id.btnWackyOHDEAR:
                    playSound(wackyohdear);
                    break;
                case R.id.btnWackyOINUTTER:
                    playSound(wackygrenade);
                    break;
                case R.id.btnWackyOOFF1:
                    playSound(wackyooff1);
                    break;
                case R.id.btnWackyOOFF2:
                    playSound(wackyooff2);
                    break;
                case R.id.btnWackyOOFF3:
                    playSound(wackyooff3);
                    break;
                case R.id.btnWackyOOPS:
                    playSound(wackyoops);
                    break;
                case R.id.btnWackyORDERS:
                    playSound(wackyorders);
                    break;
                case R.id.btnWackyOUCH:
                    playSound(wackyouch);
                    break;
                case R.id.btnWackyOW1:
                    playSound(wackyow1);
                    break;
                case R.id.btnWackyOW2:
                    playSound(wackyow2);
                    break;
                case R.id.btnWackyOW3:
                    playSound(wackyow3);
                    break;
                case R.id.btnWackyPERFECT:
                    playSound(wackyperfect);
                    break;
                case R.id.btnWackyREVENGE:
                    playSound(wackyrevenge);
                    break;
                case R.id.btnWackyRUNAWAY:
                    playSound(wackyrunaway);
                    break;
                case R.id.btnWackySTUPID:
                    playSound(wackystupid);
                    break;
                case R.id.btnWackyTAKECOVER:
                    playSound(wackytakecover);
                    break;
                case R.id.btnWackyTRAITOR:
                    playSound(wackytraitor);
                    break;
                case R.id.btnWackyUHOH:
                    playSound(wackyuhoh);
                    break;
                case R.id.btnWackyVICTORY:
                    playSound(wackyvictoty);
                    break;
                case R.id.btnWackyWATCHTHIS:
                    playSound(wackywatchthis);
                    break;
                case R.id.btnWackyWHATTHE:
                    playSound(wackywhatthe);
                    break;
                case R.id.btnWackyWOBBLE:
                    playSound(wackywobble);
                    break;
                case R.id.btnWackyYESSIR:
                    playSound(wackyyessir);
                    break;
                case R.id.btnWackyYOULLREGRETTHAT:
                    playSound(wackyyoullregetthat);
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

        wackyamazing = loadSound("wackyAMAZING.WAV");
        wackyboring = loadSound("wackyBORING.WAV");
        wackybrilliant = loadSound("wackyBRILLIANT.WAV");
        wackybummer = loadSound("wackyBUMMER.WAV");
        wackybungle = loadSound("wackyBUNGEE.WAV");
        wackybyebye = loadSound("wackyBYEBYE.WAV");
        wackycollect = loadSound("wackyCOLLECT.WAV");
        wackycomeonthen = loadSound("wackyCOMEONTHEN.WAV");
        wackycoward = loadSound("wackyCOWARD.WAV");
        wackydragonpunch = loadSound("wackyDRAGONPUNCH.WAV");
        wackydrop = loadSound("wackyDROP.WAV");
        wackyexellent = loadSound("wackyEXCELLENT.WAV");
        wackyfatality = loadSound("wackyFATALITY.WAV");
        wackyfire = loadSound("wackyFIRE.WAV");
        wackyfireball = loadSound("wackyFIREBALL.WAV");
        wackyfirstblood = loadSound("wackyFIRSTBLOOD.WAV");
        wackyflawless = loadSound("wackyFLAWLESS.WAV");
        wackygoaway = loadSound("wackyGOAWAY.WAV");
        wackygrenade = loadSound("wackyGRENADE.WAV");
        wackyhello = loadSound("wackyHELLO.WAV");
        wackyhurry = loadSound("wackyHURRY.WAV");
        wackyincoming = loadSound("wackyINCOMING.WAV");
        wackyjump1 = loadSound("wackyJUMP1.WAV");
        wackyjump2 = loadSound("wackyJUMP2.WAV");
        wackyjustyouwait = loadSound("wackyJUSTYOUWAIT.WAV");
        wackylaugh = loadSound("wackyLAUGH.WAV");
        wackyleavemealone = loadSound("wackyLEAVEMEALONE.WAV");
        wackymissed = loadSound("wackyMISSED.WAV");
        wackynooo = loadSound("wackyNOOO.WAV");
        wackyohdear = loadSound("wackyOHDEAR.WAV");
        wackyoinutter = loadSound("wackyOINUTTER.WAV");
        wackyooff1 = loadSound("wackyOOFF1.WAV");
        wackyooff2 = loadSound("wackyOOFF2.WAV");
        wackyooff3 = loadSound("wackyOOFF3.WAV");
        wackyoops = loadSound("wackyOOPS.WAV");
        wackyorders = loadSound("wackyORDERS.WAV");
        wackyouch = loadSound("wackyOUCH.WAV");
        wackyow1 = loadSound("wackyOW1.WAV");
        wackykamikaze = loadSound("wackyKAMIKAZE.WAV");
        wackyow2 = loadSound("wackyOW2.WAV");
        wackyow3 = loadSound("wackyOW3.WAV");
        wackyperfect = loadSound("wackyPERFECT.WAV");
        wackyrevenge = loadSound("wackyREVENGE.WAV");
        wackyrunaway = loadSound("wackyRUNAWAY.WAV");
        wackystupid = loadSound("wackySTUPID.WAV");
        wackytakecover = loadSound("wackyTAKECOVER.WAV");
        wackytraitor = loadSound("wackyTRAITOR.WAV");
        wackyuhoh = loadSound("wackyUH-OH.WAV");
        wackyvictoty = loadSound("wackyVICTORY.WAV");
        wackywatchthis = loadSound("wackyWATCHTHIS.WAV");
        wackywhatthe = loadSound("wackyWHATTHE.WAV");
        wackywobble = loadSound("wackyWOBBLE.WAV");
        wackyyessir = loadSound("wackyYESSIR.WAV");
        wackyyoullregetthat = loadSound("wackyYOULLREGRETTHAT.WAV");
        wackyillgetyou = loadSound("wackyILLGETYOU.WAV");
    }
}
