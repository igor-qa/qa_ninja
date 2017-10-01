package ee.igor.mainfragments.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        addItem(new DummyItem("1", "What is Quality?", "Customer's satisfaction; Product being under requirements. BUT! Each type of customer will have their own view on quality. Meeting the requirements doesn't guarantee customer's popularity."));
        addItem(new DummyItem("2", "What is Software Quality?", "Software Quality is how close the actual software product is to the expected (intended) product.\n" +
                "Quality Software: Bug-free; Meets requirements and expectations; Delivered on time."));
        addItem(new DummyItem("3", "What is Software Quality Assurance?", "Software QA is the process of monitoring and improving all activities associated with software development, from requirements gathering, design and reviews to coding, testing and implementation."));
        addItem(new DummyItem("4", "What is Software Testing?", "Software Testing is the process of analyzing the software in order to detect differences between existing and required conditions and to evaluate the features of the software."));
        addItem(new DummyItem("5", "Purpose of Software Testing?", "Verification (Check the actual results against the requirements); Validation (Check that our system is what the user actually wanted); Error detection."));
        addItem(new DummyItem("6", "Difference between Software Quality Assurance and Testing?", "SQA is \"preventative\" and about the whole process of software development, starting with the requirements. ST is mainly about testing the software to detect the differences between existing and requirements."));
        addItem(new DummyItem("7", "What is the software development life cycle (SDLC)?", " Conceptual model used in project management that describes the stages involved in an information system development project, from an initial feasibility study through maintenance of the completed application."));
        addItem(new DummyItem("8", "Main phases of the Software Development Life Cycle?", "Planning (Concept development & Planning);\n" +
                "Analysis (Requirements gathering & Analysis);\n" +
                "Design (Architecture & Specifications);\n" +
                "Development (Development; Test; Implementation);\n" +
                "Maintenance."));
        addItem(new DummyItem("9", "What is Agile Software Development?", "It is a group of software development methods based on iterative and incremental development, where requirements and solutions evolve through collaboration between self-organizing, cross-functional teams."));
        addItem(new DummyItem("10", "What is Waterfall model?", "Waterfall model is a sequential SD process, in which progress is seen as flowing steadily downwards through the phases of Conception, Initiation, Analysis, Design, Construction, Testing and Maintenance."));
        addItem(new DummyItem("11", "What is Build?", "Build - process of converting source code into software product that can run on computer."));
        addItem(new DummyItem("12", "What is Version?", "Version - unique version name or number to identify states of an application. Version is generally assigned in increasing order and correspond to new developments in the software."));
        addItem(new DummyItem("13", "What is Release?", "Release - software is ready for or has been delivered or provided to the customer."));
        addItem(new DummyItem("14", "How to test if there are not requirements?", "Use common sense;\n" +
                "Compare to similar applications;\n" +
                "Try exploratory testing."));
        addItem(new DummyItem("15", "What is Manual Testing?", "Manual testing - when tester plays the role of an end user.\n" +
                "Test all features to ensure the correct behavior."));
        addItem(new DummyItem("16", "What is Automation?", "A process of writing a computer program to do testing that would otherwise need to be done manually."));
        addItem(new DummyItem("17", "Define Black Box Testing?", "Testing done from user perspective (no access to source code used)."));
        addItem(new DummyItem("18", "What is Gray Box Testing?", "Gray box testing is using structural, design, and environment information to expand or focus Black box testing and to enhance testing productivity by using appropriate methods and tools."));
        addItem(new DummyItem("19", "What is White Box Testing?", "White box testing is done with an access to the source code. This testing is based on knowledge of the internal logic of an applications code."));
        addItem(new DummyItem("20", "What is Functional Testing?", "Functional testing is conducted to verify that functions of a system are working as specified. Typically functions are described in work products (requirements, specifications, etc), but can be undocumented;"));
        addItem(new DummyItem("21", "What is non-functional Testing?", "Non-Functional testing is conducted to test attributes of a component or system that do not relate to functionality: Reliability; Efficiency; Usability; Maintainability; Compatibility, etc."));
        addItem(new DummyItem("22", "What is Positive Testing?", "Aimed at showing that software handles properly situations in which user acts as expected (verification). Positive testing runs to verify that a software works as expected when user conducts a correct actions."));
        addItem(new DummyItem("23", "What is Negative Testing?", "Aimed at showing that software handles properly situations in which user acts not as user is supposed to act. Negative testing runs to verify that a software handles exceptions properly (invalid actions, inputs, settings.)"));
        addItem(new DummyItem("24", "What is Boundary Testing?", "Boundary testing or a Boundary value analysis explores values near the limits of valid ranges.\n" +
                "100 < x < 200"));
        addItem(new DummyItem("25", "What is Exploratory Testing?", "Exploratory testing is when the tester \"explores\" an application. No requirements. Tester, based on experience and creativity, learns things and generates new tests to run. Black box testing. Manual testing."));
        addItem(new DummyItem("26", "What is Ad hoc Testing?", "Simplified form of Exploratory Testing where test Planning, Executing and Learning are happening at the same time."));
        addItem(new DummyItem("27", "What is Unit Testing?", "Testing of individual software components or modules. Unit tests are usually run by developers (or whitebox testers) during development process to ensure that code meets its design."));
        addItem(new DummyItem("28", "What is Integration Testing?", "Integration testing is a phase in software testing in which individual software modules are combined and tested as a group."));
        addItem(new DummyItem("29", "What is System Testing?", "System testing is conducted on complete system to evaluate it's compliance with the requirements.\n" +
                "System testing is a black box testing. You need to know the design or logic."));
        addItem(new DummyItem("30", "What end-to-end Testing?", "Test a complete application in closest to production environment (interacting with a database using network communications or interacting with other hardware applications or systems if appropriate, etc)."));
        addItem(new DummyItem("31", "Define User Acceptance test?", "User Acceptance Testing (UAT) user scenarios - gives end users confidence that the delivered application meet their requirements."));
        addItem(new DummyItem("32", "What is Release/Build Acceptance Testing?", "When Release Engineer (developer) says that new release is done, QA should make sure it's good enough to be accepted for testing, so the QA team can move from previous release to the new one."));
        addItem(new DummyItem("33", "What is Installation Testing?", "Installation testing verifies that the system is installed and set up correctly to work at actual customers hardware."));
        addItem(new DummyItem("34", "What is Compatibility Testing?", "Compatibility testing is testing conducted on the application to evaluate the application's compatibility with the computing environment."));
        addItem(new DummyItem("35", "What is Browser Compatibility Testing?", "rowser compatibility is a user's web applications testing, to ensures that application look, behave, and respond the same way across different browsers."));
        addItem(new DummyItem("36", "What is Smoke Testing?", "Smoke testing is run to identify simple failures severe enough to reject software release.\n" +
                "Doest the program run?\n" +
                "Does it open a window?\n" +
                "Does clicking the main buttons do anything?"));
        addItem(new DummyItem("37", "What is Sanity Check Testing?", "Sanity testing is a basic test to quickly evaluate if the calculation result can be true. Is it reasonable? It's not to catch all mistakes, but to identify areas with obviously false results."));
        addItem(new DummyItem("38", "What is Regression Testing?", "Partial retesting of a modified program to make sure that no new errors were introduced while making changes to the code (developing new or fixing existing one)."));
        addItem(new DummyItem("39", "What is Alpha Testing?", "Alpha testing takes place at developers' sites, and involves testing of the operational system by internal staff, before it is released to external customers."));
        addItem(new DummyItem("40", "What is Beta Testing?", "Beta testing takes place at customers' sites, and involves testing by a group of customers who use the system at their own locations and provide feedback, before the system is released to other customers."));
        addItem(new DummyItem("41", "Explain Performance Testing?", "Testing performed to determine how a system performs in terms of responsiveness and stability under a particular workload."));
        addItem(new DummyItem("42", "Explain Load Testing?", "Load testing is conducted to understand the behavior of the system under a specific expected load. Simplest form of performance testing."));
        addItem(new DummyItem("43", "What is Stress Testing?", "Stress testing is conducted to understand the behavior of the system under an extreme load."));
        addItem(new DummyItem("44", "What is Recoverability Testing?", "Recoverability testing is conducted to verify that if the system fails:\n" +
                "How it will re-establish a specified level of performance?\n" +
                "How it will recover directly affected data?"));
        addItem(new DummyItem("45", "What is Usability Testing?", "Usability testing is used to evaluate product by testing it on users.\n" +
                "Usability testing measures how easy it is to use specific object or set of objects."));
        addItem(new DummyItem("46", "What is Accessibility Testing?", "Accessibility testing is conducted to test the compliance with standards. Examples: World Web Consortium (W3C) - GUI; Americans with Disabilities Act of 1990; Wikipedia Accessibility; etc."));
        addItem(new DummyItem("47", "What is Security Testing?", "Security testing is conducted to test that:\n" +
                "System data is protected;\n" +
                "How system prevents the intrusion by hackers."));
        addItem(new DummyItem("48", "What is Localization Testing?", "Localization is the process of adapting internationalized software for a specific region or language by adding locale-specific components and translating text."));
        addItem(new DummyItem("49", "What is the most frequently execute type of Testing?", "Release/build acceptance (each & every build)\n" +
                "Next one is regression."));
        addItem(new DummyItem("50", "Describe a bug?", "ismatch between actual behavior of a software application and its intended (expected) behavior. We learn about expected behavior from requirements, specifications, and other technical documentations."));
        addItem(new DummyItem("51", "Most important components of Bug Reports?", "Short Description (Title);\n" +
                "Steps to reproduce;\n" +
                "Severity;\n" +
                "Priority;\n" +
                "Status."));
        addItem(new DummyItem("52", "Describe bug life cycle?", "Bug found and reported;\n" +
                "Development Manager set \"assigned to\" and priority;\n" +
                "Developer fixes the bug;\n" +
                "Tester validated that bug was fixed (if not bug going back to developer) and closes the bug."));
        addItem(new DummyItem("53", "Name 3 levels of bug priority?", "High;\n" +
                "Medium;\n" +
                "Low."));
        addItem(new DummyItem("54", "Which type of testing results in highest numbers of bug reports? ", "Negative testing (versus Positive testing of same type)."));
        addItem(new DummyItem("55", "Statuses of bugs?", "Open;\n" +
                "Pending;\n" +
                "Fixed/Resolved;\n" +
                "Closed;\n" +
                "Can't Reproduce;\n" +
                "Deferred;"));
        addItem(new DummyItem("56", "If Developer can't reproduce a bug?", "Reproduce on your computer; Then reproduce on 1-3 other computers. If you can reproduce the defect: Compare developer’s and your working environment; Ask developer to debug on QA environment with his/her tools."));
        addItem(new DummyItem("57", "Why do you need Bug Tracking Database?", "Accountability;\n" +
                "Communication tool (inter-personal and inter-departmental);\n" +
                "Organization of the information;\n" +
                "Monitoring individual performance;"));
        addItem(new DummyItem("58", "What is Test Plan?", "Document that describes the objectives, scope, approach, and focus of a software testing effort."));
        addItem(new DummyItem("59", "What is Test Case?", "Set of conditions and/or variables under which a tester will determine if a requirement upon an application is satisfied."));
        addItem(new DummyItem("60", "Most Important Components of Test Cases?", "Test case ID;\n" +
                "Title / Purpose;\n" +
                "Instructions;\n" +
                "Expected result;\n" +
                "Actual result;\n" +
                "Pass/Fail."));
        addItem(new DummyItem("61", "Why we use Test Cases?", "Better testing coverage;\n" +
                "Re-usable;\n" +
                "Reviewable;\n" +
                "Traceable - know what is tested;\n" +
                "Tracking test results;\n" +
                "Creates a deliverable."));
        addItem(new DummyItem("62", "What is Text Suite?", "A document specifying a sequence of actions for the execution of multiple test cases."));
        addItem(new DummyItem("63", "How many Test Cases you can create if you don't have requirements?", "Zero! No requirements - no test cases."));
        addItem(new DummyItem("64", "What is Traceability Matrix?", "Traceability Matrix is a table that correlates requirements (design documents) to test documents."));
        addItem(new DummyItem("65", "Describe Rick Analysis?", "Risk Analysis means the actions taken to avoid things going wrong on a software development project, things that might negatively impact the scope, quality, timeliness, or cost of a project."));
        addItem(new DummyItem("66", "When have you done enough testing?", "When testing process comes to the point at which additional tests will not significantly change quality of the software."));
        addItem(new DummyItem("67", "Which documents would you refer to when creating Test Cases?", "To all business and technical documentation available: PRD - Product Requirements Document; BRD - Business Requirements Document; Functional Specifications; Manuals and Help; Use Cases; Test Design."));
        addItem(new DummyItem("68", "What is the difference between a test case and a test plan?", "Test case describes both typical and atypical situation (set of conditions and/or variables) that may occur in the use of an application.\n" +
                "Test plan describes the objectives, scope, approach, and focus of a software testing effort."));
        addItem(new DummyItem("69", "What is HTML?", "HTML is a markup language to describe Web pages."));
        addItem(new DummyItem("70", "What is JavaScript?", "JavaScript is a scripting language which designed to add interactivity to HTML pages."));
        addItem(new DummyItem("71", "What is SQL?", "SQL stands for Structured Query Language. It is a database computer language, designed to retrieve and manage data, create and modify dB schema, etc."));
        addItem(new DummyItem("72", "What is DataBase?", "Database (dB) is a storage space for content / information (data);\n" +
                "It is an organized collection of data."));
        addItem(new DummyItem("73", "What is XML?", "XML stands for EXtensible Markup Language;\n" +
                "XML was designed to carry data, not to display data;\n" +
                "XML tags are not predefined. You must define your own tags."));
        addItem(new DummyItem("74", "What is CSS?", "CSS stands for Cascading Style Sheets;\n" +
                "CSS define how to display HTML elements."));
        addItem(new DummyItem("75", "What is Firebug?", "Firebug integrates with Firefox to put a wealth of web development tools at your fingertips while you browse. You can edit, debug, and monitor CSS, HTML, and JavaScript live in any web page."));
        addItem(new DummyItem("76", "What is Cookies?", "Cookies were designed to be a reliable mechanism for websites to remember stateful information (such as items in a shopping cart) or to record the user's browsing activity (clicking particular buttons, logging in, etc)."));
        addItem(new DummyItem("77", "What is HTTP?", "Short for HyperText Transfer Protocol, HTTP is a set of standards that allow users of the World Wide Web to exchange information found on web pages."));
        addItem(new DummyItem("78", "What is IP Address?", "An Internet Protocol address (IP address) is a numerical label assigned to each device (e.g., computer, printer) participating in a computer network that uses the Internet Protocol for communication."));
        addItem(new DummyItem("79", "What is VPN?", "A virtual private network (VPN) is a network that uses a public telecommunication infrastructure, such as the Internet, to provide remote offices or individual users with secure access to their organization's network."));
        addItem(new DummyItem("80", "What is Selenium?", "A set of tools that supports rapid development of test automation for web-based applications."));
        addItem(new DummyItem("81", "What is XPATH?", "XPath is used to navigate through elements and attributes in an XML document."));
        addItem(new DummyItem("82", "What is PHP?", "PHP is a server scripting language, and is a powerful tool for making dynamic and interactive Web pages quickly."));
        addItem(new DummyItem("83", "What is API?", "An API (Application Programming Interface) is the interface implemented by an application which allows other applications to communicate with it."));
        addItem(new DummyItem("84", "Types Mobile Platforms?", "Licensed (JME, BREW, LiMo)\n" +
                "Proprietary (iOS, Windows Phone, BB 10)\n" +
                "Open Source (Android-OHA, Tizen, Linux OS, Firefox OS, webOS (LG))"));
        addItem(new DummyItem("85", "Name All Android Versions?", "(No codename - 1.0 - September 23, 2008)\n" +
                "(Internally known as \"Petit Four\" - 1.1 - February 9, 2009)\n" +
                "Cupcake - 1.5 - Aprill 27, 2009\n" +
                "Donut - 1.6 - September 15, 2009\n" +
                "Eclair 2.0-2.1 - October 26, 2009\n" +
                "Froyo - 2.2-2.2.3 - May 20, 2010\n" +
                "Gingerbread - 2.3-2.3.7 - December 6, 2010\n" +
                "Honeycomb - 3.0-3.2.6 - February 22,  2011\n" +
                "Ice Cream Sandwich - 4.0-4.0.4 - October 18, 2011\n" +
                "Jelly Bean - 4.1-4.3.1 - July 9, 2012\n" +
                "KitKat - 4.4-4.4.4 - October 31, 2013\n" +
                "Lollipop - 5.0-5.1.1 - November 12, 2014\n" +
                "Marshmallow - 6.0-6.0.1 - October 5, 2015\n" +
                "Nougat 7.0-7.1.2 - August 22, 2016\n" +
                "Oreo - 8.0 - August 21, 2017\n"));
        addItem(new DummyItem("86", "Android file formats?", "Android application package file (APK) is the file format used to distribute and install application software and middleware onto Google's Android operating system; very similar to .exe in Windows."));
        addItem(new DummyItem("87", "Short description of the Android?", "Android is based on the Linux operating system and written in a customized version of the Java language. Originally developed by Android, Inc., it was later acquired by Google, although the OS itself remains free and open source."));
        addItem(new DummyItem("88", "Short description of the iOS?", "iOS is Apple's proprietary mobile operating system (OS) for its handheld devices, such as the iPhone, iPad and iPod Touch. The operating system is based on the Unix and primary development language is Objective-C."));
        addItem(new DummyItem("89", "iOS file formats?", "An .IPA file is an iPhone application archive file which stores an iPhone app. It is usually encrypted with Apple's FairPlay DRM technology."));
        addItem(new DummyItem("90", "Short description of the Windows Phone OS?", "Windows Phone is a mobile platform developed by Microsoft. It is the successor to its Windows Mobile platform, although incompatible with it."));
        addItem(new DummyItem("91", "What is Mobile APP?", "A Mobile app is a software that runs on a handheld device, which can connect to Wi-Fi or wireless carrier networks and has an OS to support standalone software."));
        addItem(new DummyItem("92", "What is Native APP?", "Native app is the one that is specifically designed to run on a device’s operating system and machine firmware, and typically needs to be adapted for different devices."));
        addItem(new DummyItem("93", "How to make screenshot on iPhone (iOS device)?", "Press the \"Home\" and \"Sleep\" buttons at the same time."));
        addItem(new DummyItem("94", "How to make screenshot on Android?", "Press and hold the \"Volume Down\" and \"Power\" buttons at the same time (for Android 4.0 or later)."));
        addItem(new DummyItem("95", "How to find crash logs on iOS?", "Sync your iOS device with iTunes.\n" +
                "For Windows 7,8:\n" +
                "C:\\Users\\<USERNAME>\\AppData\\Roaming\\Apple computer\\Logs\\CrashReporter\\MobileDevice\\<DEVICE_NAME>"));
        addItem(new DummyItem("96", "How to find crash logs on Android?", "Run Eclipse, go to \"Window\" → \"Show View\" → \"Other\", then select \"LogCat\"."));
        addItem(new DummyItem("97", "How to kill process on Android?", "Tap and Hold Home Button – Task Manager window appears;\n" +
                "Tap Active Application – \"View Active Applications\" – \"Exit/End\" it individually or \"Exit/End all\"."));
        addItem(new DummyItem("98", "How to kill process on iOS?", "Double tap the home button to bring up the multi-tasking view;\n" +
                "Swipe the app upwards to close."));
        addItem(new DummyItem("99", "What is the difference between Mobile Testing and Mobile Application Testing?", "TestingMobile Testing means the complete testing of mobile in System level + Application level;\n" +
                "Mobile Application testing deals with only the features and multimedia part."));
    }

    private static void addItem (DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /*private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }
    */

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString()
        {
            return content;
        }
    }
}
