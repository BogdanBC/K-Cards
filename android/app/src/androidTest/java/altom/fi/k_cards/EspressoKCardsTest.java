//package altom.fi.k_cards;
//
//import android.test.ActivityInstrumentationTestCase2;
//import android.test.suitebuilder.annotation.LargeTest;
//
//import org.hamcrest.CoreMatchers;
//import org.junit.Rule;
//import org.junit.runner.RunWith;
//
//import static android.support.test.espresso.Espresso.onView;
//import static android.support.test.espresso.action.ViewActions.click;
//import static android.support.test.espresso.action.ViewActions.typeText;
//import static android.support.test.espresso.assertion.ViewAssertions.matches;
//import static android.support.test.espresso.core.deps.guava.base.CharMatcher.anyOf;
//import static android.support.test.espresso.core.deps.guava.base.CharMatcher.is;
//import static android.support.test.espresso.matcher.ViewMatchers.*;
//import static org.hamcrest.CoreMatchers.allOf;
//import static org.hamcrest.CoreMatchers.startsWith;
//import static org.hamcrest.core.StringEndsWith.endsWith;
////import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
////import static android.support.test.espresso.matcher.ViewMatchers.withId;
////import static android.support.test.espresso.matcher.ViewMatchers.withText;
//
//
///**
// * Created by BBC on 29/07/15.
// */
////@RunWith(AndroidJUnit4.class)
////@LargeTest
////public class EspressoKCardsTest {
////
////    @Rule
////    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);
////
////    public void listGoesOverTheFold() {
////        onView(withText("Hello world!")).check(matches(isDisplayed()));
////    }
////}
//
//@LargeTest
//public class EspressoKCardsTest extends ActivityInstrumentationTestCase2<Main> {
//
//    public EspressoKCardsTest() {
//        super(Main.class);
//    }
//
//    @Override
//    public void setUp() throws Exception {
//        super.setUp();
//        getActivity();
//    }
//
//    public void changeColor() throws InterruptedException {
//
//
//        onView(withId(R.id.add_name_button)).perform(click());
//        onView(withText("Add Your Name")).check(matches(isDisplayed()));
//        onView(withClassName(endsWith("android.widget.EditText"))).perform(typeText("BBC"));
//        onView(allOf(withText("Add"), withClassName(CoreMatchers.endsWith("android.widget.Button")))).perform(click());
//        onView(withText("Change Color")).perform(click());
//        onView(withText(startsWith("   "))).check(matches(isDisplayed()));
//        onView(withText("Change Color")).perform(click());
//        onView(withText(startsWith("Red"))).check(matches(isDisplayed()));
//        onView(withText("Change Color")).perform(click());
//        onView(withText(startsWith("Blue"))).check(matches(isDisplayed()));
//        onView(withText("Change Color")).perform(click());
//        onView(withText(startsWith("Green"))).check(matches(isDisplayed()));
//
//        onView(withId(R.id.add_name_button)).perform(click());
//        onView(withClassName(endsWith("android.widget.EditText"))).perform(typeText("Ionel"));
//        onView(allOf(withText("Add"), withClassName(CoreMatchers.endsWith("android.widget.Button")))).perform(click());
//        onView(withText("IONEL")).perform(click());
//        onView(withText(startsWith("Yellow"))).check(matches(isDisplayed()));
//        onView(withText("IONEL")).perform(click());
//        onView(withText(startsWith("Red"))).check(matches(isDisplayed()));
//        onView(withText("IONEL")).perform(click());
//        onView(withText(startsWith("Blue"))).check(matches(isDisplayed()));
//        onView(withText("IONEL")).perform(click());
//        onView(withText(startsWith("Green"))).check(matches(isDisplayed()));
//
//    }
//}