package Set;

import java.util.HashSet;
import java.util.Set;

/**
 * Data Structures Lab 4: Set - Student Exam Results Analysis
 */
public class SetLab {

    public static void main(String[] args) {

        System.out.println(
                "=== STUDENT EXAM RESULTS ANALYSIS ==="
        );

        System.out.println(
                "Learning HashSet operations through "
                + "exam result analysis\n"
        );

        // ========== SECTION 1: Creating Sets ==========
        System.out.println(
                "1. Creating sets for students "
                + "who passed each exam..."
        );

        Set<String> mathPassers = new HashSet<>();
        Set<String> englishPassers = new HashSet<>();
        Set<String> sciencePassers = new HashSet<>();

        System.out.println("   Three subject sets created!");

        System.out.println(
                "   Math passers size: " + mathPassers.size()
        );

        System.out.println(
                "   English passers size: " + englishPassers.size()
        );

        System.out.println(
                "   Science passers size: " + sciencePassers.size()
        );

        System.out.println();

        // ========== SECTION 2: Adding Students ==========
        System.out.println(
                "2. Adding students who passed each exam..."
        );

        mathPassers.add("Alice");
        mathPassers.add("Bob");
        mathPassers.add("Charlie");
        mathPassers.add("Diana");
        mathPassers.add("Eve");

        englishPassers.add("Alice");
        englishPassers.add("Bob");
        englishPassers.add("Frank");
        englishPassers.add("Grace");
        englishPassers.add("Diana");

        sciencePassers.add("Charlie");
        sciencePassers.add("Diana");
        sciencePassers.add("Eve");
        sciencePassers.add("Frank");
        sciencePassers.add("Henry");

        System.out.println("   Students added to all sets!");

        System.out.println(
                "   Math passers: " + mathPassers
        );

        System.out.println(
                "   English passers: " + englishPassers
        );

        System.out.println(
                "   Science passers: " + sciencePassers
        );

        System.out.println();

        // ========== SECTION 3: Membership ==========
        System.out.println(
                "3. Testing set properties and membership..."
        );

        boolean alicePassedMath =
                mathPassers.contains("Alice");

        boolean johnPassedEnglish =
                englishPassers.contains("John");

        System.out.println(
                "   Did Alice pass Math? " + alicePassedMath
        );

        System.out.println(
                "   Did John pass English? " + johnPassedEnglish
        );

        System.out.println(
                "   Math passers count: " + mathPassers.size()
        );

        System.out.println(
                "   English passers count: "
                + englishPassers.size()
        );

        System.out.println(
                "   Science passers count: "
                + sciencePassers.size()
        );

        System.out.println();

        // ========== SECTION 4: Duplicate Handling ==========
        System.out.println(
                "4. Testing how sets handle duplicates..."
        );

        System.out.println(
                "   Before adding duplicate - Math passers: "
                + mathPassers
        );

        System.out.println(
                "   Math passers size: " + mathPassers.size()
        );

        boolean addedAlice = mathPassers.add("Alice");
        boolean addedNewStudent = mathPassers.add("Zoe");

        System.out.println(
                "   Adding Alice again returned: " + addedAlice
        );

        System.out.println(
                "   Adding Zoe returned: " + addedNewStudent
        );

        System.out.println(
                "   After adding - Math passers: " + mathPassers
        );

        System.out.println(
                "   Math passers size: " + mathPassers.size()
        );

        System.out.println();

        // ========== SECTION 5: Intersection ==========
        System.out.println(
                "5. Finding students who passed "
                + "ALL three exams (intersection)..."
        );

        Set<String> allThreePassers =
                new HashSet<>(mathPassers);

        allThreePassers.retainAll(englishPassers);
        allThreePassers.retainAll(sciencePassers);

        System.out.println(
                "   Students who passed all three exams: "
                + allThreePassers
        );

        System.out.println(
                "   Number of students who passed all three: "
                + allThreePassers.size()
        );

        System.out.println();

        // ========== SECTION 6: Union ==========
        System.out.println(
                "6. Finding students who passed "
                + "AT LEAST one exam (union)..."
        );

        Set<String> atLeastOnePassers =
                new HashSet<>(mathPassers);

        atLeastOnePassers.addAll(englishPassers);
        atLeastOnePassers.addAll(sciencePassers);

        System.out.println(
                "   Students who passed at least one exam: "
                + atLeastOnePassers
        );

        System.out.println(
                "   Number of students who passed at least one: "
                + atLeastOnePassers.size()
        );

        System.out.println();

        // ========== SECTION 7: Exactly Two ==========
        System.out.println(
                "7. Finding students who passed exactly two exams..."
        );

        Set<String> onlyMath =
                new HashSet<>(mathPassers);

        onlyMath.removeAll(englishPassers);
        onlyMath.removeAll(sciencePassers);

        Set<String> onlyEnglish =
                new HashSet<>(englishPassers);

        onlyEnglish.removeAll(mathPassers);
        onlyEnglish.removeAll(sciencePassers);

        Set<String> onlyScience =
                new HashSet<>(sciencePassers);

        onlyScience.removeAll(mathPassers);
        onlyScience.removeAll(englishPassers);

        Set<String> exactlyTwoPassers =
                new HashSet<>(atLeastOnePassers);

        exactlyTwoPassers.removeAll(allThreePassers);
        exactlyTwoPassers.removeAll(onlyMath);
        exactlyTwoPassers.removeAll(onlyEnglish);
        exactlyTwoPassers.removeAll(onlyScience);

        System.out.println(
                "   Students who passed exactly 2 exams: "
                + exactlyTwoPassers
        );

        System.out.println();

        // ========== SECTION 9: Student Analysis ==========
        System.out.println(
                "9. Detailed analysis for each student..."
        );

        System.out.println(
                "   Individual student analysis:"
        );

        for (String student : atLeastOnePassers) {

            System.out.print(
                    "   " + student + " passed: "
            );

            if (mathPassers.contains(student)) {
                System.out.print("Math ");
            }

            if (englishPassers.contains(student)) {
                System.out.print("English ");
            }

            if (sciencePassers.contains(student)) {
                System.out.print("Science ");
            }

            System.out.println();
        }

        System.out.println();

        // ========== SECTION 10: Summary ==========
        System.out.println(
                "10. Summary of set operations performed..."
        );

        System.out.println(
                "   Math passers: " + mathPassers
        );

        System.out.println(
                "   English passers: " + englishPassers
        );

        System.out.println(
                "   Science passers: " + sciencePassers
        );

        System.out.println();

        System.out.println(
                "   Intersection (all three): "
                + allThreePassers
        );

        System.out.println(
                "   Union (at least one): "
                + atLeastOnePassers
        );

        System.out.println(
                "   Exactly two passers: "
                + exactlyTwoPassers
        );

        System.out.println();

        // ========== SECTION 11: Removing Students ==========
        System.out.println(
                "11. Demonstrating remove operations..."
        );

        Set<String> testSet =
                new HashSet<>(mathPassers);

        System.out.println(
                "   Test set before removal: " + testSet
        );

        boolean removed = testSet.remove("Alice");
        boolean removedAgain = testSet.remove("Alice");

        System.out.println(
                "   Removed Alice: " + removed
        );

        System.out.println(
                "   Test set after removing Alice: " + testSet
        );

        System.out.println(
                "   Tried to remove Alice again: "
                + removedAgain
        );

        System.out.println(
                "   Test set unchanged: " + testSet
        );

        System.out.println();

        // ========== SECTION 12: Final Statistics ==========
        System.out.println("12. Final statistics...");

        int exactlyOneCount =
                atLeastOnePassers.size()
                - allThreePassers.size()
                - exactlyTwoPassers.size();

        System.out.println(
                "   Total unique students: "
                + atLeastOnePassers.size()
        );

        System.out.println(
                "   Students who passed all three: "
                + allThreePassers.size()
        );

        System.out.println(
                "   Students who passed exactly two: "
                + exactlyTwoPassers.size()
        );

        System.out.println(
                "   Students who passed exactly one: "
                + exactlyOneCount
        );

        System.out.println();

        System.out.println(
                "   Math pass rate: "
                + mathPassers.size()
                + "/"
                + atLeastOnePassers.size()
                + " students"
        );

        System.out.println(
                "   English pass rate: "
                + englishPassers.size()
                + "/"
                + atLeastOnePassers.size()
                + " students"
        );

        System.out.println(
                "   Science pass rate: "
                + sciencePassers.size()
                + "/"
                + atLeastOnePassers.size()
                + " students"
        );

        System.out.println("\n=== LAB COMPLETE ===");
    }
}