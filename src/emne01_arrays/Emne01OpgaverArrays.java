package emne01_arrays; // Husk at sætte den korrekte package øverst i din fil

import java.util.ArrayList;

/**
 * Generel Beskrivelse for Opgavesættet Emne 1: Arrays
 * ====================================================
 * Dette opgavesæt dækker Emne 1: Arrays.
 * Formålet er at øve grundlæggende array-operationer, forståelse af
 * arrays faste størrelse, og hvordan man manuelt kan håndtere "udvidelser".
 * Du skal selv overveje og implementere håndtering af edge cases.
 * Opgaverne løses i de dedikerede statiske metoder. Main-metoden er kun til
 * eventuelle egne, manuelle testkald.
 */
public class Emne01OpgaverArrays {

    /**
     * Opgave 1.1: Array-rotation
     * -------------------------
     * Beskrivelse:
     * Skriv en statisk metode opgave1_1_rotateLeft(int[] arr, int positions) der tager et array af heltal arr
     * og et antal positions som input. Metoden skal rotere elementerne i arrayet positions
     * pladser mod venstre. Elementer, der roteres ud over starten af arrayet, skal indsættes bagerst.
     * Metoden skal *ikke* returnere et nyt array, men modificere det oprindelige array.
     * <p>
     * Eksempel:
     * Hvis arr er {1, 2, 3, 4, 5} og positions er 2, skal arr efter kaldet være {3, 4, 5, 1, 2}.
     * Hvis positions er større end arrayets længde, eller negativ, skal rotationen ske effektivt
     * modulo arrayets længde (f.eks. -1 rotation på et array af længde 5 er som 4 venstre-rotationer).
     * <p>
     */
    public static void opgave1_1_rotateLeft(int[] arr, int positions) {
        // TODO: Implementer rotationslogikken for arr.
        // Håndter selv edge cases som null array, tomt array.
        // Modificer 'arr' direkte. Overvej brug af et hjælpearray hvis nødvendigt.
    }

    /**
     * Opgave 1.2: Sammenfletning af to sorterede arrays
     * -------------------------------------------------
     * Beskrivelse:
     * Skriv en statisk metode opgave1_2_mergeSortedArrays(int[] arr1, int[] arr2) der tager to
     * *allerede sorterede* arrays af heltal (arr1 og arr2) som input. Metoden skal returnere et
     * *nyt* array, der indeholder alle elementerne fra arr1 og arr2, også sorteret.
     * Du må *ikke* blot sammensætte de to arrays og derefter kalde en indbygget sorteringsmetode.
     * <p>
     * Eksempel:
     * arr1 = {1, 3, 5}, arr2 = {2, 4, 6} => returnerer {1, 2, 3, 4, 5, 6}.
     */
    public static int[] opgave1_2_mergeSortedArrays(int[] arr1, int[] arr2) {
        // TODO: Implementer flettelogikken for arr1 og arr2.
        // Håndter edge cases: Hvad hvis et eller begge input-arrays er null eller tomme?
        // Opret et nyt array 'mergedArray' med passende størrelse.
        // Brug indekser til at iterere gennem arr1, arr2 og mergedArray,
        // og indsæt elementer i sorteret rækkefølge.
        // Husk at kopiere eventuelle resterende elementer fra det ene array,
        // når det andet er løbet tørt.
        return null; // Skal erstattes med det flettede array
    }

    /**
     * Opgave 1.4: Manuel "udvidelse" af et array
     * --------------------------------------------
     * Beskrivelse:
     * Da arrays har en fast størrelse, kan man ikke direkte tilføje elementer ud over
     * den oprindelige kapacitet. Man må i stedet oprette et nyt, større array og
     * kopiere elementerne over.
     * Skriv en statisk metode `opgave1_4_addElement(int[] originalArray, int elementToAdd)`
     * der tager et array af heltal og et heltal, der skal tilføjes.
     * Metoden skal returnere et *nyt* array, der er én plads større end `originalArray`
     * og indeholder alle elementerne fra `originalArray` plus `elementToAdd` til sidst.
     * <p>
     * Eksempel:
     * originalArray = {10, 20, 30}, elementToAdd = 40 => returnerer {10, 20, 30, 40}.
     * originalArray = {}, elementToAdd = 5 => returnerer {5}.
     */
    public static int[] opgave1_4_addElement(int[] originalArray, int elementToAdd) {
        // TODO: Implementer addElement.
        // Håndter hvis originalArray er null (returner f.eks. et nyt array med kun elementToAdd).
        // 1. Opret et nyt array 'newArray' der er én plads større end originalArray.
        // 2. Kopier alle elementer fra originalArray over i starten af newArray.
        // 3. Placer elementToAdd på den sidste plads i newArray.
        // 4. Returner newArray.
        return null; // Skal erstattes
    }

    /**
     * Opgave 1.5, Del A - Spørgsmål: Problem ved Array-tilføjelse
     * ----------------------------------------------------------
     * Beskrivelse:
     * Overvej et array `String[] navneArray = new String[3];` som er fyldt.
     * Hvorfor er det problematisk direkte at forsøge at tilføje et fjerde navn
     * (f.eks. ved `navneArray[3] = "David";`)?
     * Returner nummeret på det korrekte svar nedenfor.
     * <p>
     * Svarmuligheder:
     * 1. Det vil automatisk udvide arrayet, men gøre programmet langsommere.
     * 2. Det vil forårsage en ArrayIndexOutOfBoundsException, fordi arrayets størrelse er fast på 3 og indeks 3 er udenfor.
     * 3. Det vil overskrive det første element i arrayet (navneArray[0]) med det nye navn.
     */
    public static int opgave1_5_delA_svarProblem() {
        // TODO: Erstat 0 med dit svar (1, 2, eller 3)
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 1.5, Del A - Kode: Manuel Array-udvidelse
     * -------------------------------------------------
     * Beskrivelse:
     * Denne metode skal demonstrere, hvordan man typisk "udvider" et array.
     * Tag et `originalArray` af strenge og et `elementToAdd`.
     * Returner et *nyt* array, der er én plads større end `originalArray`
     * og indeholder alle elementerne fra `originalArray` plus `elementToAdd` til sidst.
     */
    public static String[] opgave1_5_delA_udvidArrayKode(String[] originalArray, String elementToAdd) {
        // TODO: Implementer manuel array-udvidelse.
        // Håndter hvis originalArray er null (returner f.eks. et nyt array med kun elementToAdd).
        // 1. Opret et nyt array, der er én plads større.
        // 2. Kopier elementer fra originalArray.
        // 3. Tilføj elementToAdd på sidste plads.
        // 4. Returner det nye array.
        return null; // Skal erstattes
    }

    /**
     * Opgave 1.5, Del B - Kode: ArrayList Demonstration
     * -------------------------------------------------
     * Beskrivelse:
     * Denne metode skal demonstrere de specificerede ArrayList-operationer.
     * Formålet er at kontrastere med array-adfærd for at illustrere pointer fra
     * dine noter om forskellen mellem Array og ArrayList (fleksibel størrelse, metoder).
     * Opret en ArrayList, udfør operationerne, og returner den endelige liste.
     */
    public static ArrayList<String> opgave1_5_delB_demonstrerArrayList() {
        ArrayList<String> navneListe = new ArrayList<>();
        // TODO: Udfør følgende operationer på 'navneListe':
        //   1. Tilføj navnene "Alice", "Bob", "Charlie".
        //   2. Tilføj navnet "David".
        //   3. Fjern det andet navn fra listen (elementet der oprindeligt var "Bob" på indeks 1).
        //   4. Returner den modificerede 'navneListe'.
        return navneListe; // Skal modificeres og returneres korrekt
    }

    /**
     * Opgave 1.5, Del C - Spørgsmål: Array vs. ArrayList Diskussion
     * --------------------------------------------------------------
     * Beskrivelse:
     * For hver af de følgende situationer, angiv om et Array (A) eller en ArrayList (L)
     * typisk er det bedste valg ved at sætte de tilsvarende char-variabler (svar1 til svar5).
     * Metoden vil formatere og returnere dine svar som en enkelt streng.
     * <p>
     * Situationer:
     * 1. Du skal gemme månedlige salgstal for et helt år (præcis 12 tal). Ydeevne for direkte adgang er vigtig.
     * 2. Du læser et ukendt antal brugernavne fra en fil og skal gemme dem.
     * 3. Du implementerer et bræt til et spil som skak (8x8 felter) - her tænkes på selve brættets repræsentation.
     * 4. Du har brug for en samling, der automatisk kan vokse og skrumpe, og som tilbyder mange hjælpemetoder.
     * 5. Du arbejder med en stor mængde primitive datatyper (f.eks. double) og vil minimere hukommelses-overhead.
     */
    public static String opgave1_5_delC_svarDiskussion() {
        // TODO: For hver situation, sæt den tilsvarende 'svarX' variabel til 'A' for Array eller 'L' for ArrayList.
        char svar1 = ' '; // Situation 1
        char svar2 = ' '; // Situation 2
        char svar3 = ' '; // Situation 3
        char svar4 = ' '; // Situation 4
        char svar5 = ' '; // Situation 5

        // Tjek om alle svar er udfyldt, ellers returner en påmindelse
        if (svar1 == ' ' || svar2 == ' ' || svar3 == ' ' || svar4 == ' ' || svar5 == ' ') {
            return "TODO: Udfyld venligst alle svar (svar1 til svar5) med 'A' eller 'L' i metoden opgave1_5_delC_svarDiskussion.";
        }
        // Formaterer svarene til den specificerede streng
        return String.format("1:%c,2:%c,3:%c,4:%c,5:%c", svar1, svar2, svar3, svar4, svar5);
    }

    /**
     * Opgave 1.6: Omvend Array (In-place)
     * -----------------------------------
     * Beskrivelse:
     * Skriv en statisk metode `opgave1_6_reverseArrayInPlace(int[] arr)`, der omvender
     * rækkefølgen af elementerne i det givne array `arr` direkte.
     * Metoden skal *ikke* returnere et nyt array, men modificere `arr`.
     * <p>
     * Eksempel:
     * Hvis arr er {1, 2, 3, 4, 5}, skal arr efter kaldet være {5, 4, 3, 2, 1}.
     */
    public static void opgave1_6_reverseArrayInPlace(int[] arr) {
        // TODO: Implementer metoden til at omvende arrayet 'arr' direkte (in-place).
        // Håndter relevante edge cases (f.eks. null, tom, eller et-elements array).
    }

    /**
     * Opgave 1.7: Find Alle Indekser for en Værdi
     * -------------------------------------------
     * Beskrivelse:
     * Skriv en statisk metode `opgave1_7_findAllIndices(int[] arr, int valueToFind)`,
     * der returnerer et *nyt* array indeholdende alle de indekser, hvor `valueToFind`
     * optræder i input-arrayet `arr`.
     * Hvis værdien ikke findes, eller hvis input-arrayet er null/tomt,
     * skal der returneres et tomt array (f.eks. `new int[0]`).
     * Rækkefølgen af indekser i resultat-arrayet skal være stigende.
     * <p>
     * Eksempel:
     * arr = {1, 5, 2, 5, 3, 5}, valueToFind = 5 => returnerer {1, 3, 5}
     */
    public static int[] opgave1_7_findAllIndices(int[] arr, int valueToFind) {
        // TODO: Implementer metoden til at finde alle indekser for 'valueToFind' i 'arr'.
        // Returner et nyt array med indekserne. Overvej hvordan du bestemmer størrelsen
        // på resultatarrayet. Håndter edge cases.
        return new int[0]; // Skal erstattes
    }

    /**
     * Opgave 1.8: Tjek om Array er Sorteret
     * -------------------------------------
     * Beskrivelse:
     * Skriv en statisk metode `opgave1_8_isArraySorted(int[] arr, boolean ascending)`,
     * der tjekker, om elementerne i arrayet `arr` er sorteret.
     * Hvis `ascending` er `true`, tjekkes for stigende orden.
     * Hvis `ascending` er `false`, tjekkes for faldende orden.
     * Et array med 0 eller 1 element betragtes altid som sorteret.
     * <p>
     * Eksempel:
     * arr = {1, 3, 5, 7}, ascending = true => returnerer true
     * arr = {7, 5, 3, 1}, ascending = false => returnerer true
     */
    public static boolean opgave1_8_isArraySorted(int[] arr, boolean ascending) {
        // TODO: Implementer metoden til at verificere om 'arr' er sorteret
        // i henhold til 'ascending' parameteren. Husk at arrays med 0 eller 1 element
        // per definition er sorterede. Håndter null input.
        return false; // Skal erstattes
    }

    /**
     * Opgave 1.9: Fjern Duplikater (Bevar Orden af Første Forekomst)
     * --------------------------------------------------------------
     * Beskrivelse:
     * Skriv en statisk metode `opgave1_9_removeDuplicates(int[] arr)`, der tager et
     * array af heltal `arr` (ikke nødvendigvis sorteret) og returnerer et *nyt* array,
     * der kun indeholder de unikke elementer fra `arr`. Rækkefølgen af elementernes
     * *første* forekomst i det oprindelige array skal bevares i resultatarrayet.
     * <p>
     * Eksempel:
     * arr = {1, 5, 2, 5, 3, 1, 5, 2} => returnerer {1, 5, 2, 3}
     */
    public static int[] opgave1_9_removeDuplicates(int[] arr) {
        // TODO: Implementer metoden til at fjerne duplikerede elementer fra 'arr'.
        // Rækkefølgen af de unikke elementers første forekomst skal bevares.
        // Returner et nyt array. Håndter edge cases (null, tom).
        return new int[0]; // Skal erstattes
    }

    /**
     * Opgave 1.10: Beregn Løbende Gennemsnit
     * ---------------------------------------
     * Beskrivelse:
     * Skriv en statisk metode `opgave1_10_calculateRunningAverage(int[] arr)`,
     * der tager et array af heltal `arr` og returnerer et *nyt* array af `double`,
     * hvor hvert element `result[i]` er gennemsnittet af de første `i+1` elementer
     * af input-arrayet `arr` (dvs. gennemsnittet af `arr[0]...arr[i]`).
     * <p>
     * Eksempel:
     * arr = {2, 4, 6, 8} => returnerer {2.0, 3.0, 4.0, 5.0}
     */
    public static double[] opgave1_10_calculateRunningAverage(int[] arr) {
        // TODO: Implementer metoden til at beregne det løbende gennemsnit.
        // Returner et nyt double-array. Håndter edge cases (null, tom).
        // Vær opmærksom på heltaldivision, når gennemsnittet beregnes.
        return new double[0]; // Skal erstattes
    }

    public static void main(String[] args) {
        System.out.println("=== Emne 1: Arrays (Udvidet) - Main metode til VALGFRI manuel test ===");
        System.out.println("=== Brug JUnit-tests (Emne01OpgaverArraysTest.java) til primær verificering. ===");
    }

    /**
     * Opgave 1.3: Administration af Kursusdeltagere (med Array)
     * -------------------------------------------------------
     * Beskrivelse:
     * Du skal lave et simpelt system til at administrere deltagere på et kursus,
     * hvor du eksplicit bruger et array til at gemme deltagerne. Dette indebærer at
     * oprette en 'Participant' klasse og en 'Course' klasse. 'Course' klassen
     * skal indeholde et array af 'Participant' objekter og metoder til at
     * tilføje, finde, udskrive og fjerne deltagere.
     * Opgaven fokuserer på manuel håndtering af arrayets faste størrelse,
     * inklusiv at rykke elementer ved fjernelse.
     * <p>
     * Delopgaver (implementeres som metoder i Course-klassen nedenfor):
     * - opgave1_3_addParticipant(Participant p)
     * - opgave1_3_findParticipantById(int participantId)
     * - opgave1_3_printAllParticipants()
     * - opgave1_3_removeParticipantById(int participantId)
     */
    // --- Hjælpeklasser for Opgave 1.3 følger herunder ---
    static class Participant {
        String name;
        int participantId;

        public Participant(String name, int id) {
            this.name = name;
            this.participantId = id;
        }

        public int getParticipantId() {
            return participantId;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "ID: " + participantId + ", Navn: " + name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Participant that = (Participant) o;
            return participantId == that.participantId;
        }
    }

    static class Course {
        private String courseName;
        private Participant[] participantsArray;
        private int currentNumberOfParticipants;
        private int maxParticipants;

        public Course(String courseName, int maxParticipants) {
            this.courseName = courseName;
            if (maxParticipants < 0) {
                this.maxParticipants = 0;
            } else {
                this.maxParticipants = maxParticipants;
            }
            this.participantsArray = new Participant[this.maxParticipants];
            this.currentNumberOfParticipants = 0;
        }

        public int getCurrentNumberOfParticipants() {
            return currentNumberOfParticipants;
        }

        public int getMaxParticipants() {
            return maxParticipants;
        }

        public Participant[] getParticipantsDirectlyForTest() {
            return participantsArray;
        }


        /**
         * Opgave 1.3 Delopgave: addParticipant
         * Beskrivelse: Tilføjer en deltager til kurset, hvis der er plads.
         */
        public boolean opgave1_3_addParticipant(Participant p) {
            boolean added = false;
            if (currentNumberOfParticipants < maxParticipants) {
                if (p != null) {
                    participantsArray[currentNumberOfParticipants] = p;
                    added = true;
                    currentNumberOfParticipants++;
                }
            }
            return added;
        }

        /**
         * Opgave 1.3 Delopgave: findParticipantById
         * Beskrivelse: Finder og returnerer en deltager baseret på ID.
         */
        public Participant opgave1_3_findParticipantById(int participantId) {
            Participant p = null;
            int i = 0;
            while (i < participantsArray.length && p == null) {
                if (participantsArray[i].participantId == participantId) {
                    p = participantsArray[i];
                } else {
                    i++;
                }
            }
            return p;
        }

        /**
         * Opgave 1.3 Delopgave: printAllParticipants
         * Beskrivelse: Udskriver information om alle tilmeldte deltagere.
         */
        public void opgave1_3_printAllParticipants() {
            System.out.println("Deltagere på kurset '" + courseName + "' (Max: " + maxParticipants + ", Aktuelt: " + currentNumberOfParticipants + "):");
            if (currentNumberOfParticipants == 0) {
                System.out.println("  (Ingen tilmeldte deltagere)");
            } else {
                for (Participant p : participantsArray) {
                    System.out.println(p);
                }
            }
        }

        /**
         * Opgave 1.3 Delopgave: removeParticipantById
         * Beskrivelse: Finder og fjerner en deltager baseret på ID, og rykker elementer sammen.
         */
        public boolean opgave1_3_removeParticipantById(int participantId) {
            if (participantsArray[0] == null) {
                return false;
            }
            int index = -1;
            int i = 0;
            while (index == -1 && i < participantsArray.length) {
                if (participantsArray[i].participantId == participantId) {
                    index = i;
                } else {
                    i++;
                }
            }
            if (index == -1) {
                return false;
            } else {
                while (participantsArray[index] != null) {
                    participantsArray[index] = participantsArray[index + 1];
                    index++;
                }
                participantsArray[index - 1] = null;
                currentNumberOfParticipants--;
                return true;

            }
        }
    }
}