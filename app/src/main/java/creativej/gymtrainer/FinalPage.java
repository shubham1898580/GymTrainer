package creativej.gymtrainer;

import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import layout.Chest;

import static java.lang.Math.random;

public class FinalPage extends AppCompatActivity {
int key;
    ImageView pic;
    TextView textView;

    private static final String TAG = "MainActivity";

    private AdView mAdView;

    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_page);


        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-4996416652632375/1319852899");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());



pic= (ImageView) findViewById(R.id.imageViewfinal);
        textView= (TextView) findViewById(R.id.textviewfinal);
        Bundle bundle = getIntent().getExtras();
        key=bundle.getInt("key");
        if (key == 0) {
           pic.setImageResource(R.drawable.pushup);
            textView.setText("First you must get on the ground. Lay with your toes on the ground holding yourself up with your hands." +
                    " Lower your torso to the ground until your elbows reach a 90 degree angle. Keep your elbows close to your body " +
                    "for more resistance. Keep your head facing forward. Try to have the tip of your nose pointed directly ahead. " +
                    "Keep your body in a flat plank—do not drop your hips, and do not have your butt hanging in the air. It is " +
                    "important to keep your body as straight as possible. Remember to breath as you lower yourself." +
                    "Raise yourself by pushing the ground away from you. Breathe out as you push. The power for that push will come " +
                    "from your shoulders and chest working in unison. The triceps (the muscle on the back side of your upper arm) are" +
                    " also contracted but they aren't the primary muscle group being used. Don't be tempted to use your rear end or" +
                    " your stomach. Continue to exert force until your arms are almost in a straight position again, make sure to not" +
                    " lock your arms.Repeat lowering and raising at a steady pace. Each pair counts as a single push up. Do this until you" +
                    " finish your set or you hit your maximum.");}
        if (key == 1) {
            pic.setImageResource(R.drawable.pullup);
            textView.setText("Grab the pull-up bar with the palms facing forward using the prescribed grip. Note on grips: For a wide grip, your hands need to be spaced out at a distance wider than your shoulder width. For a medium grip, your hands need to be spaced out at a distance equal to your shoulder width and for a close grip at a distance smaller than your shoulder width.\n" +
                    "As you have both arms extended in front of you holding the bar at the chosen grip width, bring your torso back around 30 degrees or so while creating a curvature on your lower back and sticking your chest out. This is your starting position.\n" +
                    "Pull your torso up until the bar touches your upper chest by drawing the shoulders and the upper arms down and back. Exhale as you perform this portion of the movement. Tip: Concentrate on squeezing the back muscles once you reach the full contracted position. The upper torso should remain stationary as it moves through space and only the arms should move. The forearms should do no other work other than hold the bar.\n" +
                    "After a second on the contracted position, start to inhale and slowly lower your torso back to the starting position when your arms are fully extended and the lats are fully stretched.\n" +
                    "Repeat this motion for the prescribed amount of repetitions.");
    }
        if (key == 2) {
            pic.setImageResource(R.drawable.inclinedumbellpress);
            textView.setText("Lie back on an incline bench with a dumbbell in each hand atop your thighs. The palms of your hands will be facing each other.\n" +
                    "Then, using your thighs to help push the dumbbells up, lift the dumbbells one at a time so that you can hold them at shoulder width.\n" +
                    "Once you have the dumbbells raised to shoulder width, rotate your wrists forward so that the palms of your hands are facing away from you. This will be your starting position.\n" +
                    "Be sure to keep full control of the dumbbells at all times. Then breathe out and push the dumbbells up with your chest.\n" +
                    "Lock your arms at the top, hold for a second, and then start slowly lowering the weight. Tip Ideally, lowering the weights should take about twice as long as raising them.\n" +
                    "Repeat the movement for the prescribed amount of repetitions.\n" +
                    "When you are done, place the dumbbells back on your thighs and then on the floor. This is the safest manner to release the dumbbells.");
        }
        if (key == 3) {
            pic.setImageResource(R.drawable.declinedumbbell);
            textView.setText("Secure your legs at the end of the decline bench and slowly lay down on the bench.\n" +
                    "Using a medium width grip (a grip that creates a 90-degree angle in the middle of the movement between the forearms and the upper arms), lift the bar from the rack and hold it straight over you with your arms locked. The arms should be perpendicular to the floor. This will be your starting position. Tip: In order to protect your rotator cuff, it is best if you have a spotter help you lift the barbell off the rack.\n" +
                    "As you breathe in, come down slowly until you feel the bar on your lower chest.\n" +
                    "After a second pause, bring the bar back to the starting position as you breathe out and push the bar using your chest muscles. Lock your arms and squeeze your chest in the contracted position, hold for a second and then start coming down slowly again. Tip: It should take at least twice as long to go down than to come up).\n" +
                    "Repeat the movement for the prescribed amount of repetitions.\n" +
                    "When you are done, place the bar back in the rack.");
        }
        if (key == 4) {
            pic.setImageResource(R.drawable.inclinebenchdumbbellflys);
            textView.setText("Hold a dumbbell on each hand and lie on an incline bench that is set to an incline angle of no more than 30 degrees.\n" +
                    "Extend your arms above you with a slight bend at the elbows.\n" +
                    "Now rotate the wrists so that the palms of your hands are facing you. Tip: The pinky fingers should be next to each other. This will be your starting position.\n" +
                    "As you breathe in, start to slowly lower the arms to the side while keeping the arms extended and while rotating the wrists until the palms of the hand are facing each other. Tip: At the end of the movement the arms will be by your side with the palms facing the ceiling.\n" +
                    "As you exhale start to bring the dumbbells back up to the starting position by reversing the motion and rotating the hands so that the pinky fingers are next to each other again. Tip: Keep in mind that the movement will only happen at the shoulder joint and at the wrist. There is no motion that happens at the elbow joint.\n" +
                    "Repeat for the recommended amount of repetitions.");
        }
        if (key == 5) {
            pic.setImageResource(R.drawable.chestdips);
            textView.setText("For this exercise you will need access to parallel bars. To get yourself into the starting position, hold your body at arms length (arms locked) above the bars.\n" +
                    "While breathing in, lower yourself slowly with your torso leaning forward around 30 degrees or so and your elbows flared out slightly until you feel a slight stretch in the chest.\n" +
                    "Once you feel the stretch, use your chest to bring your body back to the starting position as you breathe out. Tip: Remember to squeeze the chest at the top of the movement for a second.\n" +
                    "Repeat the movement for the prescribed amount of repetitions.");
        }
        if (key == 6) {
            pic.setImageResource(R.drawable.dumbellbentarmpullover);
            textView.setText("Lie on a flat bench with a barbell using a shoulder grip width.\n" +
                    "Hold the bar straight over your chest with a bend in your arms. This will be your starting position.\n" +
                    "While keeping your arms in the bent arm position, lower the weight slowly in an arc behind your head while breathing in until you feel a stretch on the chest.\n" +
                    "At that point, bring the barbell back to the starting position using the arc through which the weight was lowered and exhale as you perform this movement.\n" +
                    "Hold the weight on the initial position for a second and repeat the motion for the prescribed number of repetitions.");
        }
        if (key == 10) {
            pic.setImageResource(R.drawable.militarypress);
            textView.setText("Start by placing a barbell that is about chest high on a squat rack. Once you have selected the weights, grab the barbell using a pronated (palms facing forward) grip. Make sure to grip the bar wider than shoulder width apart from each other.\n" +
                    "Slightly bend the knees and place the barbell on your collar bone. Lift the barbell up keeping it lying on your chest. Take a step back and position your feet shoulder width apart from each other.\n" +
                    "Once you pick up the barbell with the correct grip length, lift the bar up over your head by locking your arms. Hold at about shoulder level and slightly in front of your head. This is your starting position.\n" +
                    "Lower the bar down to the collarbone slowly as you inhale.\n" +
                    "Lift the bar back up to the starting position as you exhale.\n" +
                    "Repeat for the recommended amount of repetitions.");
        }
        if (key == 11) {
            pic.setImageResource(R.drawable.declinedumbbell);
            textView.setText("Lie on the bench with a dumbbell in each hand and your feet flat on the floor.\n" +
                    "You can rest your feet up on the bench if it’s more comfortable.\n" +
                    "Push the dumbbells up so that your arms are directly over your shoulders and your palms are up.\n" +
                    "Pull your abdominals in, and tilt your chin toward your chest.\n" +
                    "Lower the dumbbells down and a little to the side until your elbows are slightly below your shoulders.\n" +
                    "Roll your shoulder blades back and down, like you’re pinching them together and accentuating your chest.\n" +
                    "Push the weights back up, taking care not to lock your elbows or allow your shoulder blades to rise off the bench.");
        }
        if (key == 12) {
            pic.setImageResource(R.drawable.seatedmilitarypressmachine);
            textView.setText("Sit down on the Shoulder Press Machine and select the weight.\n" +
                    "Grab the handles to your sides as you keep the elbows bent and in line with your torso. This will be your starting position.\n" +
                    "Now lift the handles as you exhale and you extend the arms fully. At the top of the position make sure that you hold the contraction for a second.\n" +
                    "Lower the handles slowly back to the starting position as you inhale.\n" +
                    "Repeat for the recommended amount of repetitions.");
        }
        if (key == 13) {
            pic.setImageResource(R.drawable.dumbbelllateralraise);
            textView.setText("Grasp dumbbells in front of thighs with elbows slightly bent. Bend over slightly with hips and knees bent slightly. Raise upper arms to sides until elbows are shoulder height. Maintain elbows' height above or equal to wrists.");
        }
        if (key == 14) {
            pic.setImageResource(R.drawable.cablefrountraise);
            textView.setText("Select the weight on a low pulley machine and grasp the single hand cable attachment that is attached to the low pulley with your left hand.\n" +
                    "Face away from the pulley and put your arm straight down with the hand cable attachment in front of your thighs at arms' length with the palms of the hand facing your thighs. This will be your starting position.\n" +
                    "While maintaining the torso stationary (no swinging), lift the left arm to the front with a slight bend on the elbow and the palms of the hand always faces down. Continue to go up until you arm is slightly above parallel to the floor. Exhale as you execute this portion of the movement and pause for a second at the top.\n" +
                    "Now as you inhale lower the arm back down slowly to the starting position.\n" +
                    "Once all of the recommended amount of repetitions have been performed for this arm, switch arms and perform the exercise with the right one.");
        }
        if (key == 15) {
            pic.setImageResource(R.drawable.uprightrows);
            textView.setText("Grasp a barbell with an overhand grip that is slightly less than shoulder width. The bar should be resting on the top of your thighs with your arms extended and a slight bend in your elbows. Your back should also be straight. This will be your starting position.\n" +
                    "Now exhale and use the sides of your shoulders to lift the bar, raising your elbows up and to the side. Keep the bar close to your body as you raise it. Continue to lift the bar until it nearly touches your chin. Tip: Your elbows should drive the motion, and should always be higher than your forearms. Remember to keep your torso stationary and pause for a second at the top of the movement.\n" +
                    "Lower the bar back down slowly to the starting position. Inhale as you perform this portion of the movement.\n" +
                    "Repeat for the recommended amount of repetitions.");
        }
        if (key == 20) {
            pic.setImageResource(R.drawable.latpulldown);
            textView.setText("Sit down on a pull-down machine with a wide bar attached to the top pulley. Make sure that you adjust the knee pad of the machine to fit your height. These pads will prevent your body from being raised by the resistance attached to the bar.\n" +
                    "Grab the bar with the palms facing forward using the prescribed grip. Note on grips: For a wide grip, your hands need to be spaced out at a distance wider than shoulder width. For a medium grip, your hands need to be spaced out at a distance equal to your shoulder width and for a close grip at a distance smaller than your shoulder width.\n" +
                    "As you have both arms extended in front of you holding the bar at the chosen grip width, bring your torso back around 30 degrees or so while creating a curvature on your lower back and sticking your chest out. This is your starting position.\n" +
                    "As you breathe out, bring the bar down until it touches your upper chest by drawing the shoulders and the upper arms down and back. Tip: Concentrate on squeezing the back muscles once you reach the full contracted position. The upper torso should remain stationary and only the arms should move. The forearms should do no other work except for holding the bar; therefore do not try to pull down the bar using the forearms.\n" +
                    "After a second at the contracted position squeezing your shoulder blades together, slowly raise the bar back to the starting position when your arms are fully extended and the lats are fully stretched. Inhale during this portion of the movement.\n" +
                    "Repeat this motion for the prescribed amount of repetitions.");
        }
        if (key == 21) {
            pic.setImageResource(R.drawable.seatedcablerow);
            textView.setText("For this exercise you will need access to a low pulley row machine with a V-bar. Note: The V-bar will enable you to have a neutral grip where the palms of your hands face each other. To get into the starting position, first sit down on the machine and place your feet on the front platform or crossbar provided making sure that your knees are slightly bent and not locked.\n" +
                    "Lean over as you keep the natural alignment of your back and grab the V-bar handles.\n" +
                    "With your arms extended pull back until your torso is at a 90-degree angle from your legs. Your back should be slightly arched and your chest should be sticking out. You should be feeling a nice stretch on your lats as you hold the bar in front of you. This is the starting position of the exercise.\n" +
                    "Keeping the torso stationary, pull the handles back towards your torso while keeping the arms close to it until you touch the abdominals. Breathe out as you perform that movement. At that point you should be squeezing your back muscles hard. Hold that contraction for a second and slowly go back to the original position while breathing in.\n" +
                    "Repeat for the recommended amount of repetitions.");
        }
        if (key == 22) {
            pic.setImageResource(R.drawable.closegripfrontlatpulldownss);
            textView.setText("Sit down on a pull-down machine with a wide bar attached to the top pulley. Make sure that you adjust the knee pad of the machine to fit your height. These pads will prevent your body from being raised by the resistance attached to the bar.\n" +
                    "Grab the bar with the palms facing forward using the prescribed grip. Note on grips: For a wide grip, your hands need to be spaced out at a distance wider than your shoulder width. For a medium grip, your hands need to be spaced out at a distance equal to your shoulder width and for a close grip at a distance smaller than your shoulder width.\n" +
                    "As you have both arms extended in front of you - while holding the bar at the chosen grip width - bring your torso back around 30 degrees or so while creating a curvature on your lower back and sticking your chest out. This is your starting position.\n" +
                    "As you breathe out, bring the bar down until it touches your upper chest by drawing the shoulders and the upper arms down and back. Tip: Concentrate on squeezing the back muscles once you reach the full contracted position. The upper torso should remain stationary (only the arms should move). The forearms should do no other work except for holding the bar; therefore do not try to pull the bar down using the forearms.\n" +
                    "After a second in the contracted position, while squeezing your shoulder blades together, slowly raise the bar back to the starting position when your arms are fully extended and the lats are fully stretched. Inhale during this portion of the movement.\n" +
                    "6. Repeat this motion for the prescribed amount of repetitions.");
        }
        if (key == 23) {
            pic.setImageResource(R.drawable.bentoverbarbellrow);
            textView.setText("Holding a barbell with a pronated grip (palms facing down), bend your knees slightly and bring your torso forward, by bending at the waist, while keeping the back straight until it is almost parallel to the floor. Tip: Make sure that you keep the head up. The barbell should hang directly in front of you as your arms hang perpendicular to the floor and your torso. This is your starting position.\n" +
                    "Now, while keeping the torso stationary, breathe out and lift the barbell to you. Keep the elbows close to the body and only use the forearms to hold the weight. At the top contracted position, squeeze the back muscles and hold for a brief pause.\n" +
                    "Then inhale and slowly lower the barbell back to the starting position.\n" +
                    "Repeat for the recommended amount of repetitions.");
        }
        if (key == 24) {
            pic.setImageResource(R.drawable.tbarrow);
            textView.setText("Position a bar into a landmine or in a corner to keep it from moving. Load an appropriate weight onto your end.\n" +
                    "Stand over the bar, and position a Double D row handle around the bar next to the collar. Using your hips and legs, rise to a standing position.\n" +
                    "Assume a wide stance with your hips back and your chest up. Your arms should be extended. This will be your starting position.\n" +
                    "Pull the weight to your upper abdomen by retracting the shoulder blades and flexing the elbows. Do not jerk the weight or cheat during the movement.\n" +
                    "After a brief pause, return to the starting position.");
        }
        if (key == 25) {
            pic.setImageResource(R.drawable.dumbellrows);
            textView.setText("Choose a flat bench and place a dumbbell on each side of it.\n" +
                    "Place the right leg on top of the end of the bench, bend your torso forward from the waist until your upper body is parallel to the floor, and place your right hand on the other end of the bench for support.\n" +
                    "Use the left hand to pick up the dumbbell on the floor and hold the weight while keeping your lower back straight. The palm of the hand should be facing your torso. This will be your starting position.\n" +
                    "Pull the resistance straight up to the side of your chest, keeping your upper arm close to your side and keeping the torso stationary. Breathe out as you perform this step. Tip: Concentrate on squeezing the back muscles once you reach the full contracted position. Also, make sure that the force is performed with the back muscles and not the arms. Finally, the upper torso should remain stationary and only the arms should move. The forearms should do no other work except for holding the dumbbell; therefore do not try to pull the dumbbell up using the forearms.\n" +
                    "Lower the resistance straight down to the starting position. Breathe in as you perform this step.\n" +
                    "Repeat the movement for the specified amount of repetitions.\n" +
                    "Switch sides and repeat again with the other arm.");
        }
        if (key == 30) {
            pic.setImageResource(R.drawable.chinups);
            textView.setText("Grab the pull-up bar with the palms facing your torso and a grip closer than the shoulder width.\n" +
                    "As you have both arms extended in front of you holding the bar at the chosen grip width, keep your torso as straight as possible while creating a curvature on your lower back and sticking your chest out. This is your starting position. Tip: Keeping the torso as straight as possible maximizes biceps stimulation while minimizing back involvement.\n" +
                    "As you breathe out, pull your torso up until your head is around the level of the pull-up bar. Concentrate on using the biceps muscles in order to perform the movement. Keep the elbows close to your body. Tip: The upper torso should remain stationary as it moves through space and only the arms should move. The forearms should do no other work other than hold the bar.\n" +
                    "After a second of squeezing the biceps in the contracted position, slowly lower your torso back to the starting position; when your arms are fully extended. Breathe in as you perform this portion of the movement.\n" +
                    "Repeat this motion for the prescribed amount of repetitions.");
        }
        if (key == 31) {
            pic.setImageResource(R.drawable.biceps_curl);
            textView.setText("Stand up straight with a dumbbell in each hand at arm's length. Keep your elbows close to your torso and rotate the palms of your hands until they are facing forward. This will be your starting position.\n" +
                    "Now, keeping the upper arms stationary, exhale and curl the weights while contracting your biceps. Continue to raise the weights until your biceps are fully contracted and the dumbbells are at shoulder level. Hold the contracted position for a brief pause as you squeeze your biceps.\n" +
                    "Then, inhale and slowly begin to lower the dumbbells back to the starting position.\n" +
                    "Repeat for the recommended amount of repetitions.");
        }
        if (key == 32) {
            pic.setImageResource(R.drawable.biceps_curl);
            textView.setText("Stand up straight with a dumbbell in each hand at arm's length. Keep your elbows close to your torso and rotate the palms of your hands until they are facing forward. This will be your starting position.\n" +
                    "Now, keeping the upper arms stationary, exhale and curl the weights while contracting your biceps. Continue to raise the weights until your biceps are fully contracted and the dumbbells are at shoulder level. Hold the contracted position for a brief pause as you squeeze your biceps.\n" +
                    "Then, inhale and slowly begin to lower the dumbbells back to the starting position.\n" +
                    "Repeat for the recommended amount of repetitions.");
        }
        if (key == 33) {
            pic.setImageResource(R.drawable.precher_curl);
            textView.setText("To perform this movement you will need a preacher bench and an E-Z bar. Grab the E-Z curl bar at the close inner handle (either have someone hand you the bar which is preferable or grab the bar from the front bar rest provided by most preacher benches). The palm of your hands should be facing forward and they should be slightly tilted inwards due to the shape of the bar.\n" +
                    "With the upper arms positioned against the preacher bench pad and the chest against it, hold the E-Z Curl Bar at shoulder length. This will be your starting position.\n" +
                    "As you breathe in, slowly lower the bar until your upper arm is extended and the biceps is fully stretched.\n" +
                    "As you exhale, use the biceps to curl the weight up until your biceps is fully contracted and the bar is at shoulder height. Squeeze the biceps hard and hold this position for a second.\n" +
                    "Repeat for the recommended amount of repetitions.");
        }
        if (key == 34) {
            pic.setImageResource(R.drawable.cable_curl);
            textView.setText("Stand up with your torso upright while holding a cable curl bar that is attached to a low pulley. Grab the cable bar at shoulder width and keep the elbows close to the torso. The palm of your hands should be facing up (supinated grip). This will be your starting position.\n" +
                    "While holding the upper arms stationary, curl the weights while contracting the biceps as you breathe out. Only the forearms should move. Continue the movement until your biceps are fully contracted and the bar is at shoulder level. Hold the contracted position for a second as you squeeze the muscle.\n" +
                    "Slowly begin to bring the curl bar back to starting position as your breathe in.\n" +
                    "Repeat for the recommended amount of repetitions.");
        }
        if (key == 35) {
            pic.setImageResource(R.drawable.concentrationcurl);
            textView.setText("Sit down on a flat bench with one dumbbell in front of you between your legs. Your legs should be spread with your knees bent and feet on the floor.\n" +
                    "Use your right arm to pick the dumbbell up. Place the back of your right upper arm on the top of your inner right thigh. Rotate the palm of your hand until it is facing forward away from your thigh. Tip: Your arm should be extended and the dumbbell should be above the floor. This will be your starting position.\n" +
                    "While holding the upper arm stationary, curl the weights forward while contracting the biceps as you breathe out. Only the forearms should move. Continue the movement until your biceps are fully contracted and the dumbbells are at shoulder level. Tip: At the top of the movement make sure that the little finger of your arm is higher than your thumb. This guarantees a good contraction. Hold the contracted position for a second as you squeeze the biceps.\n" +
                    "Slowly begin to bring the dumbbells back to starting position as your breathe in. Caution: Avoid swinging motions at any time.\n" +
                    "Repeat for the recommended amount of repetitions. Then repeat the movement with the left arm.");
        }
        if (key == 40) {
            pic.setImageResource(R.drawable.dumbbellextention);
            textView.setText("Stand with your feet hip-distance apart.\n" +
                    "Hold one dumbbell (go for your heavier weight) with both hands, bending the elbows behind your head.\n" +
                    "Straighten your arms to lift the dumbbell into the air, then slowly bend the arms to lower. This counts as one rep. Do two sets of 15 reps.");
        }
        if (key == 41) {
            pic.setImageResource(R.drawable.inclinetricepextention);
            textView.setText("Hold a barbell with an overhand grip (palms down) that is a little closer together than shoulder width.\n" +
                    "Lie back on an incline bench set at any angle between 45-75-degrees.\n" +
                    "Bring the bar overhead with your arms extended and elbows in. The arms should be in line with the torso above the head. This will be your starting position.\n" +
                    "Now lower the bar in a semicircular motion behind your head until your forearms touch your biceps. Inhale as you perform this movement. Tip: Keep your upper arms stationary and close to your head at all times. Only the forearms should move.\n" +
                    "Return to the starting position as you breathe out and you contract the triceps. Hold the contraction for a second.\n" +
                    "Repeat for the recommended amount of repetitions.");
        }
        if (key == 42) {
            pic.setImageResource(R.drawable.cabeltricepextention);
            textView.setText("Attach a rope to the bottom pulley of the pulley machine.\n" +
                    "Grasping the rope with both hands, extend your arms with your hands directly above your head using a neutral grip (palms facing each other). Your elbows should be in close to your head and the arms should be perpendicular to the floor with the knuckles aimed at the ceiling. This will be your starting position.\n" +
                    "Slowly lower the rope behind your head as you hold the upper arms stationary. Inhale as you perform this movement and pause when your triceps are fully stretched.\n" +
                    "Return to the starting position by flexing your triceps as you breathe out.\n" +
                    "Repeat for the recommended amount of repetitions.");
        }
        if (key == 43) {
            pic.setImageResource(R.drawable.closegripbenchpress);
            textView.setText("Lie back on a flat bench. Using a close grip (around shoulder width), lift the bar from the rack and hold it straight over you with your arms locked. This will be your starting position.\n" +
                    "As you breathe in, come down slowly until you feel the bar on your middle chest. Tip: Make sure that - as opposed to a regular bench press - you keep the elbows close to the torso at all times in order to maximize triceps involvement.\n" +
                    "After a second pause, bring the bar back to the starting position as you breathe out and push the bar using your triceps muscles. Lock your arms in the contracted position, hold for a second and then start coming down slowly again. Tip: It should take at least twice as long to go down than to come up.\n" +
                    "Repeat the movement for the prescribed amount of repetitions.\n" +
                    "When you are done, place the bar back in the rack.");
        }
        if (key == 44) {
            pic.setImageResource(R.drawable.narrowgrippushup);
            textView.setText("Lie on the floor face down and place your hands closer than shoulder width for a close hand position. Make sure that you are holding your torso up at arms' length.\n" +
                    "Lower yourself until your chest almost touches the floor as you inhale.\n" +
                    "Using your triceps and some of your pectoral muscles, press your upper body back up to the starting position and squeeze your chest. Breathe out as you perform this step.\n" +
                    "After a second pause at the contracted position, repeat the movement for the prescribed amount of repetitions.");
        }
        if (key == 45) {
            pic.setImageResource(R.drawable.machinetricepextention);
            textView.setText("Adjust the seat to the appropriate height and make your weight selection. Place your upper arms against the pads and grasp the handles. This will be your starting position.\n" +
                    "Perform the movement by extending the elbow, pulling your lower arm away from your upper arm.\n" +
                    "Pause at the completion of the movement, and then slowly return the weight to the starting position.\n" +
                    "Avoid returning the weight all the way to the stops until the set is complete to keep tension on the muscles being worked.");
        }
        if (key == 50) {
            pic.setImageResource(R.drawable.barbellsquat);
            textView.setText("Begin with the barbell supported on top of the traps. The chest should be up and the head facing forward. Adopt a hip-width stance with the feet turned out as needed.\n" +
                    "Descend by flexing the knees, refraining from moving the hips back as much as possible. This requires that the knees travel forward. Ensure that they stay align with the feet. The goal is to keep the torso as upright as possible.\n" +
                    "Continue all the way down, keeping the weight on the front of the heel. At the moment the upper legs contact the lower legs reverse the motion, driving the weight upward.");
        }
        if (key == 51) {
            pic.setImageResource(R.drawable.frontbarbellsquat);
            textView.setText("This exercise is best performed inside a squat rack for safety purposes. To begin, first set the bar on a rack that best matches your height. Once the correct height is chosen and the bar is loaded, bring your arms up under the bar while keeping the elbows high and the upper arm slightly above parallel to the floor. Rest the bar on top of the deltoids and cross your arms while grasping the bar for total control.\n" +
                    "Lift the bar off the rack by first pushing with your legs and at the same time straightening your torso.\n" +
                    "Step away from the rack and position your legs using a shoulder width medium stance with the toes slightly pointed out. Keep your head up at all times as looking down will get you off balance and also maintain a straight back. This will be your starting position. (Note: For the purposes of this discussion we will use the medium stance described above which targets overall development; however you can choose any of the three stances described in the foot positioning section).\n" +
                    "Begin to slowly lower the bar by bending the knees as you maintain a straight posture with the head up. Continue down until the angle between the upper leg and the calves becomes slightly less than 90-degrees (which is the point in which the upper legs are below parallel to the floor). Inhale as you perform this portion of the movement. Tip: If you performed the exercise correctly, the front of the knees should make an imaginary straight line with the toes that is perpendicular to the front. If your knees are past that imaginary line (if they are past your toes) then you are placing undue stress on the knee and the exercise has been performed incorrectly.\n" +
                    "Begin to raise the bar as you exhale by pushing the floor mainly with the middle of your foot as you straighten the legs again and go back to the starting position.\n" +
                    "Repeat for the recommended amount of repetitions.");
        }
        if (key == 52) {
            pic.setImageResource(R.drawable.calveslegpress);
            textView.setText("Using a leg press machine, sit down on the machine and place your legs on the platform directly in front of you at a medium (shoulder width) foot stance.\n" +
                    "Lower the safety bars holding the weighted platform in place and press the platform all the way up until your legs are fully extended in front of you without locking your knees. (Note: In some leg press units you can leave the safety bars on for increased safety. If your leg press unit allows for this, then this is the preferred method of performing the exercise.) Your torso and the legs should make perfect 90-degree angle. Now carefully place your toes and balls of your feet on the lower portion of the platform with the heels extending off. Toes should be facing forward, outwards or inwards as described at the beginning of the chapter. This will be your starting position.\n" +
                    "Press on the platform by raising your heels as you breathe out by extending your ankles as high as possible and flexing your calf. Ensure that the knee is kept stationary at all times. There should be no bending at any time. Hold the contracted position by a second before you start to go back down.\n" +
                    "Go back slowly to the starting position as you breathe in by lowering your heels as you bend the ankles until calves are stretched.\n" +
                    "Repeat for the recommended amount of repetitions.");
        }
        if (key == 53) {
            pic.setImageResource(R.drawable.sumosquat);
            textView.setText("Use 1 or 2 hands to pick up the kettlebell, pulling it up to your chest. Hold the kettlebell at chest level with both hands, making sure to keep your arms close to your body and elbows tucked in. Your feet should be slightly wider than shoulder-width apart, with your toes pointing slightly outward. Keep your back straight and abdominals tight. This will be your starting position.\n" +
                    "Pushing your hips back, slowly bend the knees and lower your legs until your thighs are just below parallel to the floor. Make sure to inhale during this portion of the exercise.\n" +
                    "Press through the heel of the foot and push your hips through to return to the starting position. Breathe out during this phase of the exercise.\n" +
                    "Repeat for recommended number of repetitions before bending your knees to lower the kettle bell back to the ground.");
        }
        if (key == 54) {
            pic.setImageResource(R.drawable.calfmachine);
            textView.setText("Place a block or weight plate below the bar on the Smith machine. Set the bar to a position that best matches your height. Once the correct height is chosen and the bar is loaded, step onto the plates with the balls of your feet and place the bar on the back of your shoulders.\n" +
                    "Take the bar with both hands facing forward. Rotate the bar to unrack it. This will be your starting position.\n" +
                    "Raise your heels as high as possible by pushing off of the balls of your feet, flexing your calf at the top of the contraction. Your knees should remain extended. Hold the contracted position for a second before you start to go back down.\n" +
                    "Return slowly to the starting position as you breathe in while lowering your heels.\n" +
                    "Repeat for the recommended amount of repetitions.");
        }
        if (key == 55) {
            pic.setImageResource(R.drawable.calfraiseonadumbbell);
            textView.setText("Stand with your torso upright holding two dumbbells in your hands by your sides. Place the ball of the foot on a sturdy and stable wooden board (that is around 2-3 inches tall) while your heels extend off and touch the floor. This will be your starting position.\n" +
                    "With the toes pointing either straight (to hit all parts equally), inwards (for emphasis on the outer head) or outwards (for emphasis on the inner head), raise the heels off the floor as you exhale by contracting the calves. Hold the top contraction for a second.\n" +
                    "As you inhale, go back to the starting position by slowly lowering the heels.\n" +
                    "Repeat for the recommended amount of times.");
        }
        if (key == 56) {
            pic.setImageResource(R.drawable.squat);
            textView.setText("Keep your back straight, with your neutral spine, and your chest and shoulders up. Keep looking straight ahead at that spot on the wall. As you squat down, focus on keeping your knees in line with your feet. Many new lifters need to focus on pushing their knees out so they track with their feet.");
        }
        if (key == 60) {
            pic.setImageResource(R.drawable.abslegraises);
            textView.setText("Lie with your back flat on a bench and your legs extended in front of you off the end.\n" +
                    "Place your hands either under your glutes with your palms down or by the sides holding on to the bench. This will be your starting position.\n" +
                    "As you keep your legs extended, straight as possible with your knees slightly bent but locked raise your legs until they make a 90-degree angle with the floor. Exhale as you perform this portion of the movement and hold the contraction at the top for a second.\n" +
                    "Now, as you inhale, slowly lower your legs back down to the starting position.");
        }
        if (key == 61) {
            pic.setImageResource(R.drawable.crossbodycrunches);
            textView.setText("Lay down on the floor facing your back. Turn your knees to 60 degrees and put your feet flat on the ground. Place your hands, either on your head or by the sides of your head. Fold your right arm and raising your right shoulder curl your right elbow across your body in a swinging motion towards the alternate side.");
        }
        if (key == 62) {
            pic.setImageResource(R.drawable.jack);
            textView.setText("Lie flat on the floor (or exercise mat) on your back with your arms extended straight back behind your head and your legs extended also. This will be your starting position.\n" +
                    "As you exhale, bend at the waist while simultaneously raising your legs and arms to meet in a jackknife position. Tip: The legs should be extended and lifted at approximately a 35-45 degree angle from the floor and the arms should be extended and parallel to your legs. The upper torso should be off the floor.\n" +
                    "While inhaling, lower your arms and legs back to the starting position.\n" +
                    "Repeat for the recommended amount of repetitions.");
        }
        if (key == 63) {
            pic.setImageResource(R.drawable.legraise);
            textView.setText("Lie on your back, legs straight and together.\n" +
                    "Keep your legs straight and lift them all the way up to the ceiling until your butt comes off the floor.\n" +
                    "Slowly lower your legs back down till they're just above the floor. Hold for a moment.\n" +
                    "Raise your legs back up. Repeat.");
        }
        if (key == 64) {
            pic.setImageResource(R.drawable.plank);
            textView.setText("Place the forearms on the ground with the elbows aligned below the shoulders, and arms parallel to the body at about shoulder-width distance. If flat palms bother your wrists, clasp your hands together. (Note: Any of the following plank variations can be performed with straight arms or in a forearm position.)");
        }
        if (key == 65) {
            pic.setImageResource(R.drawable.reversecrunches);
            textView.setText("Lie on the ground in a traditional crunch position, your feet flat on the floor and hands underneath your head. Press your lower back into the floor and pull in your belly button to lift your feet off of the floor. Keep your knees together, bent at 90-degree angles.");
        }

        if (key == 70) {
            pic.setImageResource(R.drawable.hanginglegcircles);
            textView.setText("This is a great hanging core move to work the obliques. Hang from a pull up bar with your palms facing away.  With your legs together, bring your knees up to the right then across the front and down to the left. Once you lower down on the left, bring them back up to the left and across the front then down to the right. Bring your knees as high up and across as you can, making as big a circle as possible. If you are using a doorway pull up bar, you will be limited in how big your circle can be.\n" +
                    "This move is also a great one to add a pull up into. Pull up as you bring your knees up and around then lower down. Next time you pull up, bring your knees up and across the other way!");
        }
        if (key == 71) {
            pic.setImageResource(R.drawable.hangingsidetosideknee);
            textView.setText("Take a grip on pull-ups bars; hang with your knees together and your body straight. This will be your starting position.\n" +
                    "Initiate the movement by flexing the hips and knees, drawing the legs up. Pull the knees up into one side, going above 90 degrees at the hip. Avoid any swinging, performing the exercise with control.\n" +
                    "Return to the starting position and then perform the movement to the other side. Continue alternating until the set in complete.");
        }
        if (key == 72) {
            pic.setImageResource(R.drawable.cabelisomatichold);
            textView.setText("Connect a standard handle to a tower. Move cable to highest pulley position.\n" +
                    "Stand with side to cable. With one hand, reach up and grab handle with underhand grip.\n" +
                    "Pull down cable until elbow touches your side and the handle is by your shoulder.\n" +
                    "Position feet hip-width apart. Place free hand on hip to help gauge pivot point.\n" +
                    "Keep arm in static position. Contract oblique to bring the weight down in a side crunch.\n" +
                    "Once you reach maximum contraction, slowly release the weight to the starting position. The weight stack should never be unloaded in a resting position. The aim is constant tension during the set.\n" +
                    "Repeat to failure.\n" +
                    "Then, reposition and repeat the same series of movements on the opposite side.");
        }
        if (key == 73) {
            pic.setImageResource(R.drawable.sideplankwithcablehold);
            textView.setText("Position yourself next to a low-pulley cable machine and get into a side plank position on your forearm, facing the cable. Grab the handle with your free hand and palm facing the floor. Arm should be fully extended." +
                    "Brace core and drive the elbow past your back, while simultaneously pulling handle to your side. Pause and contract the muscle around your shoulder blade. Slowly return hand back to starting position.");
        }
        if (key == 74) {
            pic.setImageResource(R.drawable.mountainclimers);
            textView.setText("Begin in a pushup position, with your weight supported by your hands and toes. Flexing the knee and hip, bring one leg until the knee is approximately under the hip. This will be your starting position.\n" +
                    "Explosively reverse the positions of your legs, extending the bent leg until the leg is straight and supported by the toe, and bringing the other foot up with the hip and knee flexed. Repeat in an alternating fashion for 20-30 seconds.");
        }
        if (key == 75) {
            pic.setImageResource(R.drawable.sidecranches);
            textView.setText("Start out by lying on your right side with your legs lying on top of each other. Make sure your knees are bent a little bit.\n" +
                    "Place your left hand behind your head.\n" +
                    "Once you are in this set position, begin by moving your left elbow up as you would perform a normal crunch except this time the main emphasis is on your obliques.\n" +
                    "Crunch as high as you can, hold the contraction for a second and then slowly drop back down into the starting position.\n" +
                    "Remember to breathe in during the eccentric (lowering) part of the exercise and to breathe out during the concentric (elevation) part of the exercise.");
        }

}

    @Override
    public void onBackPressed() {
        int a= (int) ((Math.random())*1000);

        if(a%3==0){

        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();

        }}
        finish();
        super.onBackPressed();
    }


}
