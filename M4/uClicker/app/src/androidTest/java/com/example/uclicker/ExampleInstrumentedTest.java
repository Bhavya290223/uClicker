package com.example.uclicker;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> aRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.uclicker", appContext.getPackageName());
    }
/// All tests from here test the basic functionality + response timings
    @Test
    public void testStudentButtonSelection() {
        long startTime = System.currentTimeMillis();
        MainActivity act = new MainActivity();
        act.findViewById(R.id.button1).perform(click());
        act.findViewById(R.id.button1).check(matches(isPressed()));

        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        assertTrue(responseTime <= 5000);
    }

    @Test
    public void testProfessorButtonSelection() {
        long startTime = System.currentTimeMillis();
        MainActivity act = new MainActivity();
        act.findViewById(R.id.button2).perform(click());
        act.findViewById(R.id.button2).check(matches(isPressed()));

        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        assertTrue(responseTime <= 5000);
    }

    @Test
    public void testCreateQuestionActivity() {
        long startTime = System.currentTimeMillis();
        MainActivity act = new MainActivity();
        act.findViewById(R.id.button1).perform(click());
        act.findViewById(R.id.button1).check(matches(isPressed()));

        Intent intent = new Intent(aRule.getActivity(), CreateQuestionActivity.class);
        aRule.getActivity().startActivity(intent);

        onView(withId(R.id.activity_create_question)).check(matches(isDisplayed()));

        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        assertTrue(responseTime <= 5000);
    }

    @Test
    public void testProfessorLoginActivity() {
        long startTime = System.currentTimeMillis();
        LoginClass myClass = new LoginClass();
        onView(withId(R.id.login_button)).perform(click());
        onView(withId(R.id.login_button)).check(matches(isPressed()));

        assertTrue(myClass.isPLoggedin());

        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        assertTrue(responseTime <= 5000);
    }

    @Test
    public void testProfessorLogoutActivity() {
        long startTime = System.currentTimeMillis();
        LoginClass myClass = new LoginClass();
        onView(withId(R.id.logout_button)).perform(click());
        onView(withId(R.id.logout_button)).check(matches(isPressed()));

        assertTrue(myClass.isPLoggedOut());

        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        assertTrue(responseTime <= 5000);
    }

    @Test
    public void testStudentLoginActivity() {
        long startTime = System.currentTimeMillis();
        LoginClass myClass = new LoginClass();
        onView(withId(R.id.login_button)).perform(click());
        onView(withId(R.id.login_button)).check(matches(isPressed()));

        assertTrue(myClass.isSLoggedin());

        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        assertTrue(responseTime <= 5000);
    }

    @Test
    public void testStudentLogoutActivity() {
        long startTime = System.currentTimeMillis();
        LoginClass myClass = new LoginClass();
        onView(withId(R.id.logout_button)).perform(click());
        onView(withId(R.id.logout_button)).check(matches(isPressed()));

        assertTrue(myClass.isSLoggedOut());

        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        assertTrue(responseTime <= 5000);
    }

    @Test
    public void testListChoices() {
        long startTime = System.currentTimeMillis();
        CreateQuestionActivity act = new CreateQuestionActivity();
        EditText a1 = act.findViewById(R.id.answer1);
        EditText a2 = act.findViewById(R.id.answer2);
        EditText a3 = act.findViewById(R.id.answer3);
        EditText a4 = act.findViewById(R.id.answer4);
        EditText a5 = act.findViewById(R.id.answer5);
        EditText a6 = act.findViewById(R.id.answer6);
        assertFalse(a1 == null);
        assertFalse(a2 == null);
        assertFalse(a3 == null);
        assertFalse(a4 == null);
        assertFalse(a5 == null);
        assertFalse(a6 == null);

        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        assertTrue(responseTime <= 5000);
    }

    @Test
    public void testOptionSelection() {
        long startTime = System.currentTimeMillis();
        AnswerQuestionActivity activity = new AnswerQuestionActivity();
        
        activity.findViewById(R.id.radioGroup).perform(click());
        activity.findViewById(R.id.radioGroup).check(matches(isPressed()));

        boolean checked = (RadioButton) findViewById(rg.getCheckedRadioButtonId()).isChecked();
        assertTrue(checked);

        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        assertTrue(responseTime <= 5000);
    }

    @Test
    public void testConfirmButton() {
        long startTime = System.currentTimeMillis();

        Intent intent = new Intent();
        intent.putExtra("message", "Hello World");

        ActivityScenario<AnswerQuestionActivity> scenario = ActivityScenario.launch(AnswerQuestionActivity.class);
        scenario.onActivity(a -> {
            Button btn = a.findViewById(R.id.button4);
            btn.perform(click());

            Intent passData = getStartedActivityIntent();
            String data = passData.getStringExtra("message");
            assertEquals("Hello World", message);
        });

        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        assertTrue(responseTime <= 5000);
    }

    
}