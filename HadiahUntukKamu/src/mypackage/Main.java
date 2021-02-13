package mypackage;

import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);
	static String question1, kode;
	static int episode;

	static Bulan[] days = new Bulan[50];

	public static void dailyNotes() {
		//minggu ke-1
		days[0] = new Bulan("1","Rabu, 1 April 2020","Hari pertama aku mulai mikir mau ngasih apa buat kamu.\n" +
									"Bingung karena mikirnya kamu suka maen game, suka doraemon, suka anime.\n" +
									"Jadi, hari ini aku baru mengkategorikan aja apa yang kamu suka. Pusing ak\n"
									+ "semaleman mkirin ap hdiah trbaik bt km. Ohiya,aku seneng kamu bilang\n"
									+ "'engga' pas ku bilang 'aku bikin kamu risih'.");
		days[1] = new Bulan("2","Kamis, 2 April 2020","Hari kedua aku kira kamu knpa-knpa gabales chat ampe sore, udah khawatir.\n"
									+ "taunya tidur wkwkwk. Ak sneng at least kau msh kbarin udh bngn, kirain\n"
									+ "mati wkwkwk. Kl km mati aku blm smpet msakin mkanan bt km. Malam hari\n"
									+ "sesaat stlh km bls chat ku, aku akhirnya mtusin utk bt program ini. Ya bt\n"
									+ "dokumentasi aja sih utk keberadaan km d hdup aku EAK WKWKWK.");
		days[2] = new Bulan("3","Jumat, 3 April 2020","Hari ketiga full kls shrian smbil bresin rmh jg. Pdahal pen chat abis\n"
									+ "kls tp udh kcpean sih jd ktduran dh, bngn tdr br cht km hehe. Ap kbr km\n"
									+ "ya, udh lma gliat muka km sjak covid-19, smoga baik-baik trs dh wkwk.");
		days[3] = new Bulan("4","Sabtu, 4 April 2020","Hari keempat ak lelah ko, knp km cuek bngt k aku? Atau cm ak yg trllu\n"
									+ "prduli k km kali ya. 35 hr ku utk km dn skrg ak btuh wktu utk driku sndri.\n"
									+ "Dah lma ga me time. Km jng kmn2 dl y, tp ak g ad hak sih mau km ngpain\n"
									+ "itu urusan u wkwk. Yg pnting jaga diri dn sehat trs, kau kn strong wkwk.");
		days[4] = new Bulan("5","Minggu, 5 April 2020","Hari kelima ak bljr msak rsep bru dn rsanya enak kta mma ppa hehe.Ak br\n"
									+ "ingt km udh mau playoff 2 mgu lg. Smngt ya! yg fokus biar mnang, ak dkung\n"
									+ "km trs! Maap ku ngilang bntr sklian biar g gnggu km trs wkwk. Smngt ko!");
		days[5] = new Bulan("6","Senin, 6 April 2020","Hari keenam ak pljarin lgu Anohana : secret base pke gitar. Lgu ny bgs \n"
									+ "feel ny dpt bngt, msh basic sih ak main ny. Tp, kl suatu saat km pen dngr\n"
									+ "nti ku mainkan utk km hehe. kl gmao jg g mksa sih. Ohya, ap kbr km ya? ak\n"
									+ "msh ngedetoks diri dr sosmed sih. Smoga scptnya slsai, ak bkal kontak km\n"
									+ "lg. Tguin ya ko. Lg improve dri ku spya jd lbh baik lg utk ak, km, dan\n"
									+ "org-org dskitar aku.");
		days[6] = new Bulan("7","Selasa, 7 April 2020","Hari ktjuh gada yg gmn sih cm kliah dn ngrus krjaan rmh. Pen maen k dufan\n"
									+ "rsanya, pen lari kek dkejer anjing wkwk. Mlai suntuk drumah doang. Sbar\n"
									+ "ya, me time ku blm slsai ko hehe. Smngt trs km y!");
		days[7] = new Bulan("8","Rabu, 8 April 2020","Hari kdlpan ak keinget y prnh nnya km siapa shinobi pling mnybalkan? Ak\n"
									+ "jg pen tau jwban ny. Cb dcri deh psti ktmu. Smngt! Ak ksh clue ny : ad d\n"
									+ "file .ppt");

		//minggu ke-2
		days[8] = new Bulan("9","Kamis, 9 April 2020","Hari ksmbilan cpek prah, dr kmren kliah full hr ini jg sm. Plus ngrus\n"
				+ "rmh, dan mntp ny lg ak 15jam buat video Anohana : Secret Base itu bt km,\n"
				+ "drpda aku mainin scra lgsg mnding vdeo aj lah wkwkwk. Smoga km sk,tp jngn\n"
				+ "d play lbh dr skali nti bosen wkwkwk.");
		days[9] = new Bulan("10","Jumat, 10 April 2020","Finally slsai me time, puas bngt rsanya bs meditasi dn improve diri lg.\n"
				+ "Mksih dah mau tnggu ya, km psti cpek sih latihan trs utk prsiapan. Smngat\n"
				+ "trus ya, aku sllu doain km yg trbaik!");
		days[10] = new Bulan("11","Sabtu, 11 April 2020","Wah mntap hr ini sneng nilai lmyan bgs wkwkwk. Btw, aku srius loh mnta\n"
				+ "email km pdhal bkn mksd mnta line/wa, krn file hdiah yg mau ku krim ini\n"
				+ "lmyan gede jd aku btuh email mu wkwkwk. Tp, kl km ksh ny line yowes gas\n"
				+ "aj aku mah. H-7 prtndingan km, smngattttt!");
		days[11] = new Bulan("12","Minggu, 12 April 2020","Hari ini sibuk ngrus krjaan rmh smpe ktduran bngn msih msak lg, jd ak rsa\n"
				+ "kt smsm sbuk mknya slowresp. H-6 match km, tp knp aku yg deg-degan ya\n"
				+ "wkwkwk. Aku mau km mnang, jd ku doain km dan team mu ksh yg trbaik.\n"
				+ "Smngatt yaaa prsiapan ny, jngn tiktokan mlu! wkwkwk.");
		days[12] = new Bulan("13","Senin, 13 April 2020","Akhrny suara nyanyi ku kmbali sprti smula, udh smpet ngeri kl smpe gbsa\n"
				+ "nyanyi lg. Demi video cover utk km, ampe seret tnggorokan aing wkwkwk.\n"
				+ "Eh, trs ujung-ujung ny km ga demen hdiahny. Awas aj sih, ribut kt kl ampe\n"
				+ "km msh hina suaraku wkwkwk. Ak pun bngung hr ini ad org yg confess pdhal\n"
				+ "ak kra dia mau tmnan aj gtu. Tp, gpp aku appreciate siapapun yg brani jjr\n"
				+ "soal prsaany. Km jg, kl misalny km ska sm prempuan lbh baik jjr aj dwaktu\n"
				+ "yg tpat jngn smpe nysel. Ak sllu dkung km, kl km btuh aku slalu brsedia\n"
				+ "dngr critamu.");
		days[13] = new Bulan("14","Selasa, 14 April 2020","Hm, biasanya nih ntah knp km sk gabales cht aku tbtb gtu. Smpe hr brkutny\n"
				+ "aku cht lg bru km bls, bngung aku ad ap sih kek gtu km wkwkwk. Berpikir\n"
				+ "hard ap yg mnyebabkan hal tsb trjdi. Ak jg g nyngka km mau d ajk jln sm\n"
				+ "aku nti, krain bkal 1001 alasan gmao wkwkwk. Mksih, i really appreciate\n"
				+ "it. Wlopun br rncana doang tp ak ud snengg.");
		days[14] = new Bulan("15","Rabu, 15 April 2020","Wah hari ini seru sih bcanda sm km ampe ngkak gtu wkwkwk. Walopun mkin\n"
				+ "mlm dimensi candaan aku mkin brbeda dn km mlai ga paham, maklum ya aku\n"
				+ "emg gt imajinasi ny ska beda sndri wkwkwk. H-3 match km, aku makin ga\n"
				+ "sbar. Smngattt kkooo!");
		days[15] = new Bulan("16","Kamis, 16 April 2020","Sneng hri ini bs vc dan bcnda breng tmn-tmn lg ampe subuh, tp khilaf sih\n"
				+ "jd krg wktu tdur. Stlah hmpir sbulan di isolasi sbtulny bosen bngt bgni\n"
				+ "trs, kngen kluar tp bukan k umn wkwkwk. Km psti sbuk prsiapan ya, hm.\n"
				+ "Smngat utk mu dan team mu ko!");

		//minggu ke-3
		days[16] = new Bulan("17","Jumat, 17 April 2020","Cpet bngt wktu brjlan, tbtb bsk km udh maen aj. Smoga menang ya! Aku hrap\n"
				+ "smua usaha klian akan mmbuahkan hsil yg trbaik. Pkoknya apapun result nya\n"
				+ "akan mnjdikan klian lbh baik dan lbh baik lgi kdpannya. Aku mau jd org yg\n"
				+ "sllu dkung km kpnpun itu hehe. Ohya, aku pen ksih hdiah lg bt km tp msh\n"
				+ "bngung apa lg ya kira-kira, km ska apa lg?");
		days[17] = new Bulan("18","Sabtu, 18 April 2020","Thank God team km bsa mnang mlam ini, smoga bsok lbh baik lgi ya hehe.\n"
				+ "Trima ksih jg even km lg sbuk msih smpet bls cht aku, i appreciate it.\n"
				+ "Hri ini aku cm fokus nugas aj sih jd ga trllu kpngen gnggu km jg. Nunggu\n"
				+ "km slsain mdl ini aj wkwkwk. Smngattt!");
		days[18] = new Bulan("19","Minggu, 19 April 2020","WAH GILA CONGRATS YAA! Sneng bngt sharian aku smbil doa ke Tuhan spya\n"
				+ "klian dpt hsil yg trbaik dan doaku dikabulkan wkwkwk. Thank God, km dan\n"
				+ "tmn-tmn psti sneng bngtt. Aku jg snenggg wkwkwk. Tp, aku jd g tau mau\n"
				+ "ngmong aplgi gtu abis slmatin km. Bdo ah nugas dlu aku wkwkwk.\n"
				+ "Slmat brsenang riaa ko.");
		days[19] = new Bulan("20","Senin, 20 April 2020","happy celebrating your official winning of MDL season 1.");
		days[20] = new Bulan("21","Selasa, 21 April 2020","[Mundur selangkah menunggu sembuh atau maju saja sampai babak belur?] itu\n"
				+ "pertanyaan ku utk diriku sndri sjak tdi mlam, demikian jg aku ingin tau\n"
				+ "apa mau mu sbnarnya. Ini knp kta searah bngt sih kek cma aku doang yg\n"
				+ "inisiatif cuy.");
		days[21] = new Bulan("22","Rabu, 22 April 2020","ok skrang sih aku udh sdar emg hrs brhnti. Hadiah ini akan ttep ku lnjut\n"
				+ "smpe slsai spya ga sia-sia. Smoga aku g nysel kdpanny, bkn nysel knal km\n"
				+ "tp nysel knp bs smpe ambyar gni jdinya.");
		days[22] = new Bulan("23","Kamis, 23 April 2020","ya hari ini aku bkin wishes card utk hri ultah km. Sngja ku tulis pnjang-\n"
				+ "pnjang dstu biar gaperlu blg lgi pas hri H ny. Ntah km btuh atau ga doa\n"
				+ "dariku tp yaudhlh bomat, driku akan trobos tros till the end of the time.");
		days[23] = new Bulan("24","Jumat, 24 April 2020","");

		//minggu ke-4
		days[24] = new Bulan("25","Sabtu, 25 April 2020","Aku cba kluarin kmu dr pkiran aku, scra sdar iya bisalah psti mknya aku\n"
				+ "ampe lpa nulis cttan kmren. Kmu tau ga klo mimpi adalah pengalaman bawah\n"
				+ "sadar yang melibatkan penglihatan, pendengaran, pikiran, perasaan, atau\n"
				+ "indra lainnya dalam tidur. Stlah smlaman, trnyta alam bwh sdar aku gasiap\n"
				+ "kehilangan kmu. Anjir kan:)");
		days[25] = new Bulan("26","Minggu, 26 April 2020","Tetap melanjutkan program ini dan hadiah-hadiah untukmu sampai selesai\n"
				+ "adalah jalan ninjaku.");
		days[26] = new Bulan("27","Senin, 27 April 2020","Aku bnyk pkiran ap gmn sih smpe udh brp mlm ini susah tdur, ampe jd krg\n"
				+ "tdur mlah kan ah. Stelah ku inget mgkin bnr kta tmnku di awal klo nti\n"
				+ "ujungnya psti aku skit sndri bgtu knal sm km, tp aku ttep prcya sm km.\n"
				+ "baka.");
		days[27] = new Bulan("28","Selasa, 28 April 2020","Keknya bosen bnr ya aku krjaannya ngemusik mulu. Tuh aku buat lgi hdiah\n"
				+ "utk km. Asli suara gitar aku dan suara ku. Dri msih seger ampe udh buluk\n"
				+ "aku ngulang berkali-kali ZZ.");
		days[28] = new Bulan("29","Rabu, 29 April 2020","Aduh aku bru dngr lgi hasil buatan ku yg anohana trnyta suara aku jlek\n"
				+ "parah WKWKWK. Udh ya gjdi ku ksih yg itu biar ku simpan sndri aj :'v\n"
				+ "trnyta mnding nyanyi asli dah daripada direkam, maap ya.");
		days[29] = new Bulan("30","Kamis, 30 April 2020","Gila wktu cpet bngt brlalu tbtb udh mei aj bsok, pdahal aktifitas gtu-gtu\n"
				+ "aj tiap hri. Kl quarantine dah kelar, aku mau jajan smpe kenyang dan jln\n"
				+ "smpe cpek sih. Kl km? plingan jg mau jln sm tmn-tmn atau mkn dluar, atau\n"
				+ "mlah gmau kluar dr gh wkwkwk. Aku gmau tnya nti dblg kepo lg wkwkwkw.");
		days[30] = new Bulan("31","Jumat, 1 Mei 2020","Hr ini mager bngt sih mau ngpa-ngpain wkwk, bwaany ngntuk aj gtu slsai\n"
				+ "ngmpulin tugas lgsg tepar ampe mlm. Abis itu bngn bresin rmh mndi tdur\n"
				+ "lgi wkwkwk. Less productive kl tnggal merah  gni sih:')");
		days[31] = new Bulan("32","Sabtu, 2 Mei 2020","Ko, aku dpt soal yg susah ny stengah mati. Udh ku pkirin dan cri jwbannya\n"
				+ "ga ktmu jg gtu. "
				+ "Barangkali km tau jwaban ny, ksh tau aku ya:)\n"
				+ "Question : Apa penyebab seorang Deven ga pernah nyariin Fany even once?\n"
				+ "A) Ga penting\t C) Ga perduli\n"
				+ "B) Ga inget\t D) A, B, dan C benar semua");

		//minggu ke-5
		days[32] = new Bulan("33","Minggu, 3 Mei 2020","Aku hri ini sdar bhwa aku pro dlm hal konsistensi dan niat. Km bs liat?\n"
				+ "Cba aj ad nominasi org terikhlas, bs kli aku yg mnang. Iya iklhas lah,\n"
				+ "org aku g mrsa trpaksa atas ap yg ku lkukan skrg wkwkwk. Happy Sunday!");
		days[33] = new Bulan("34","Senin, 4 Mei 2020","Ko, sbtulnya brp kli kau gbls chat ku itu knp sih? blh ksih tau ga\n"
				+ "jwbanny? Brp kli aku tnya kl chat ku ganggu / bkin risih ga kau blg ga,\n"
				+ "ga, dan ga. Tp utk ksekian klinya chat ku dibiarin gt aj. Cb ya lain kli\n"
				+ "kl org chat dn emg g pngen ngbrol sm tu org blg aj lgsg. Kau pkir enak\n"
				+ "cht dtinggal aj kek gt?");
		days[34] = new Bulan("35","Selasa 5 Mei 2020","2 mnggu lg hdiah ini slsai dan aku sdar bhwa stlah ini gada lg yg hrs aku\n"
				+ "krjain tiap mlm kek skrg. Jjur aku pen bngt km tau kl aku snang brjuang\n"
				+ "utk km, cm aku gpngen mksain aj. Kdang yg kt prjuangin emg blm tntu\n"
				+ "mrjuangin kt jg. Aku hrap bgtu smuanya slsai kt ttap bs jd tmn ya.");
		days[35] = new Bulan("36","Rabu, 6 Mei 2020","Udh brp hri ini tdur cpet tp anehnya mmpi buruk trs gt. Ad hbungan ny ga\n"
				+ "sih sm sk bengong gt wkwkwk. Ap kbr ko? skrg sbuk ngpain aj ya hmm.");
		days[36] = new Bulan("37","Kamis, 7 Mei 2020","Smoga dunia cpt pulih dr pandemi ini, nti kl smua sdh mmbaik psti aktvitas\n"
				+ "kt slma covid ini akan jd crta trun temurun dh kek warisan gt wkwkwk. Aku\n"
				+ "udh msti nyri krja lg nih smstr dpn, pdhal enak jd ank kcil yg gprlu krja\n"
				+ "taunya main mkn skolah gt aj:' Btuh time machine ny doraemon.");
		days[37] = new Bulan("38","Jumat, 8 Mei 2020","Aku udh nton anime yg trkhir km blg k aku 'I want to eat your pancreas'\n"
				+ "bagus, anime nya sad ending kek crita kt WKWKWK. Aku sndri g nygka jg sih\n"
				+ "crta kt bkal slsai scpat ini, bhkan sblm catatan ini slsai. Kl seandainya\n"
				+ "bs diulang, aku ttep bkal chat km jg. Kl gbsa diulang yaudh jdilah apa yg\n"
				+ "hrs trjdi.");
		days[38] = new Bulan("39","Sabtu, 9 Mei 2020","Km psti gprnh ngbcain history2 chat kt kan, aku tau itu psti\n"
				+ "krn chat trkhirku aj gprnh km read. Kl aku sneng bca history chat kt, aku\n"
				+ "bhkan sneng bngt kl kt chat. Seseneng itu smpe aku nglawan ego ku utk cht\n"
				+ "kmu wlaupun brulang kli km ngebiarin chatku bgtu aj. Tp maaf wktu trkhir\n"
				+ "km ngbiarin chat aku, aku udh gtau mau gmn. Seakan-akan km emg ga prnh\n"
				+ "btuh chat dr aku, jd aku jg ngerasa kek aku cht km tiap hr jg gbkal\n"
				+ "ngeubah apapun. Km g btuh aku dan mgkn akan slalu bgtu, smntara aku ingin\n"
				+ "jd tmpat mu brcerita ttg hari-hari km.");
		days[39] = new Bulan("40","Minggu, 10 Mei 2020","Ah udh lah aku gjdi ksh coveran lagu nya, catetan ini aj ckup kan. Lgpula\n"
				+ "suaraku b aja dan blm tntu jg km dngr cover ny nti. Btw, kbarnya wfh ini\n"
				+ "smpe akhir tahun loh, sugoi kan. Wlaupun sbtulnya aku jg gmau kondisi gni\n"
				+ "trus tp ttep d sykuri aj, smua ad hikmahnya kan. Km sehat trus ya, sring\n"
				+ "mkn sayur dan buah jan mcd trs wkwkwk.");

		//minggu ke-6
		days[40] = new Bulan("41","Senin, 11 Mei 2020","omg file project ini ga sengaja mental gtau ke folder mana trus gabisa ku\n"
				+ "bka dr eclipsenya mau nangis tdi rsanyaaa. Untung aja aku ctrl+z msih bsa\n"
				+ "balik smuaa, tkut klo smpe ilang gmn aku bkin nya udh mepet wktunyaa:( Jd\n"
				+ "kbyang apakah tnpa hdiah ini msh ad yg bs aku krim utk km d hri ultah km.\n"
				+ "Kl msh ad ksmpatan brikutnya aku akn ksh yg lbh baik lg utk ultahmu ya ko\n"
				+ "hehe.");
		days[41] = new Bulan("42","Selasa, 12 Mei 2020","Hri ini aku bkinin playlist d youtube. Khusus ultahmu yg ke-21, isi play-\n"
				+ "list ny itu 21 lgu anime trbaik mnrtku. Siapa tau km gbut, atau km stress\n"
				+ "nugas bs smbil dngerin playlist itu. Atau kl gmau dnger jg hak km sih, yg\n"
				+ "pnting aku dah buatin bt km. Km scan aj qrcode yg ad d dlm folder. Semoga\n"
				+ "km ska ya :)");
		days[42] = new Bulan("43","Rabu, 13 Mei 2020","Aku bru tau km piara anjing wkwkwk. Yaiya br tau org aku gprnh nnya dn km\n"
				+ "jg gprnh blg. Ok bkn mau bhas anjing, tp knp km g story dirimu aj biar ku\n"
				+ "bs liat keadaan mu gmn gtu. Udh brp lma ya aku g chat km, hm. Jaga kshtan\n"
				+ "ya, jan lpa sring mkn buah dn sayur sm mnum air mineral.");
		days[43] = new Bulan("44","Kamis, 14 Mei 2020","Ih tinggal brp kli lg aku tlis cttan ini trs slsai. Bkin ny brhari-hari,\n"
				+ "tp hrusnya bca nya sbntr doang sih kl km niat. Kl ga jg yaudh aku ikhlas\n"
				+ "bkin ini bt km, smoga km ska ya. Aku pnsran kra-kra di umur 21 ini km\n"
				+ "bkal jd org yg sprti apa ya, pen update trs ttg km biar kek brita harian\n"
				+ "wkwkwk.");
		days[44] = new Bulan("45","Jumat, 15 Mei 2020","Bner kta org, jrak trjauh antar 2 org bkn beda pulau / kota / bahkan beda\n"
				+ "negara. Jarak terjauh itu saling mngenal tpi gpernah saling sapa. Bkn ny\n"
				+ "sok teoritis ya, tpi ini emg knyataan ny. Aku g mksa km msti nyapa aku\n"
				+ "sih, itu hak km. Aku jg gmslah mau nyapa km dluan stiap saat, tp skrg mau\n"
				+ "nyapa jg kek udh garing gt. Ujung2 ny jg cm jd viewer story aj wkwk.");
		days[45] = new Bulan("46","Sabtu, 16 Mei 2020","Krn udh tinggal bbrpa hri lgi jd mari kt buat ksimpulan dari crita kt ya\n"
				+ "wkwkwk. Prtma aku snang bs knal km di tahun kabisat kli ini, km smbong tp\n"
				+ "baik kl udh ngbrol. Awalnya kek g konek sm bcandaan km tp lma-lma mlai\n"
				+ "ngrti km org ny gmn. Trs aku jg snang bs ngchat dn ngrbol-ngbrol sm km,\n"
				+ "anime-anime movie yg rekoman dr km bgus smua, mksih. Kl dr aku mgkn km g\n"
				+ "btuh ini, tp aku sllu dkung km dr awal kt knal. Dah itu dlu wkwkwk.");
		days[46] = new Bulan("47","Minggu, 17 Mei 2020","Nah trs utk hr ini aku pen desc km aj lh wkwkwk. Km itu org ny garing,\n"
				+ "cuek, entah pemalu / emg g tertarik cht sm aku. Km jg nyebelin, rese,\n"
				+ "smbong pula. Suka bngt ngeledek aku wkwkwk. Tp overall bs dblg km msh tau\n"
				+ "how to respect org lain dan aku ttep snang brteman sm km. Cm stlah cttan\n"
				+ "ini slsai aku mgkin bkal brhnti gnggu km jg kcuali ad hal pnting. Sukses\n"
				+ "trs ya ko.");
		days[47] = new Bulan("48","Senin, 18 Mei 2020","Lalu utk hri ini aku mau mrenungi kjdian d msa llu, sorry kl mslny aku\n"
				+ "emg annoying dn ngeganggu. Sorry jg kl aku chat yg gaje dan g pnting.\n"
				+ "Trima ksih jg km sdh respect dn ngblas chat dr aku slma bbrpa wktu llu,\n"
				+ "aku snang. Doa ku smga d wktu yg mndatang km trus mnrima brkat yg baik\n"
				+ "dari Tuhan. Amin.");

		//H-1
		days[48] = new Bulan("49","Selasa, 19 Mei 2020","Akhirnya crita ini slsai dsni. Kl km udh bca ampe slsa, trima ksih ya ko.\n"
				+ "Jngn lpa ultah bkin telur merah, kau kan chinese wkwk. Sdh sekian aj dari\n"
				+ "aku utk km, aku sdh brusaha sebaik mgkin bt ksih ini k kmu. Pesan ku, jd\n"
				+ "org yg lbh brguna dan lbh baik lgi kdpan nya! Bye ko Deven.");

	}

	public static void opening() {
		System.out.println("𝑯𝒂𝒑𝒑𝒚 𝑩𝒊𝒓𝒕𝒉𝒅𝒂𝒚 𝑫𝒆𝒗𝒆𝒏 𝑴𝒂𝒓𝒌𝒐𝒔 𝒂𝒌𝒂 𝑹𝑬𝑵𝑩𝑶");
		System.out.println("𝘐𝘯𝘪 𝘩𝘢𝘥𝘪𝘢𝘩 𝘥𝘢𝘳𝘪𝘬𝘶, 𝘴𝘦𝘮𝘰𝘨𝘢 𝘬𝘢𝘮𝘶 𝘴𝘶𝘬𝘢\r\n" +
				"~ϝαɳყ");
		System.out.println("\n𝘛𝘦𝘳𝘪𝘮𝘢 𝘬𝘢𝘴𝘪𝘩𝘯𝘺𝘢 𝘯𝘢𝘯𝘵𝘪 𝘢𝘫𝘢, 𝘭𝘢𝘯𝘨𝘴𝘶𝘯𝘨 𝘯𝘦𝘹𝘵.\r\n" +
				"𝘱𝘦𝘯𝘤𝘦𝘵 𝘦𝘯𝘵𝘦𝘳𝘯𝘺𝘢 𝘥𝘰𝘯𝘨 𝘸𝘬𝘸𝘬𝘸𝘬");
		question1 = in.nextLine();
	}

	public static void header() {
		System.out.println("===================================================");
		System.out.println("𝘔𝘢𝘺 𝘶 𝘢𝘳𝘦 𝘴𝘵𝘳𝘰𝘯𝘨 𝘦𝘯𝘰𝘶𝘨𝘩 𝘵𝘰 𝘳𝘦𝘢𝘥 𝘢𝘭𝘭 𝘵𝘩𝘦𝘴𝘦 𝘵𝘩𝘪𝘯𝘨𝘴 𝘪'𝘷𝘦 𝘣𝘦𝘦𝘯 𝘸𝘳𝘪𝘵𝘦 𝘧𝘰𝘳 𝘺𝘰𝘶");
		System.out.println("===================================================");
		System.out.println("1. Minggu Pertama April\r\n" +
				"2. Minggu Kedua April\r\n" +
				"3. Minggu Ketiga April\r\n" +
				"4. April - Mei\r\n" +
				"5. Minggu Pertama Mei\r\n" +
				"6. Minggu Kedua Mei\r\n" +
				"7. H-1");
		System.out.println("𝘒𝘢𝘶 𝘱𝘪𝘭𝘪𝘩 𝘮𝘢𝘶 𝘣𝘢𝘤𝘢 𝘺𝘨 𝘮𝘢𝘯𝘢 𝘥𝘶𝘭𝘶?");
	}

	public static void ceritaKu(String kode) {
		for(Bulan d : days) {
			if(d.getKode().contains(kode)) {
				System.out.println("\n");
					System.out.println("Date		: "+d.getTanggal());
					System.out.println("=========================================================================");
					System.out.println("Catatan		: \n"+d.getCatatan());
					System.out.println("=========================================================================");
					break;
			}
		}
	}

	public static void closing() {
		System.out.println("\n𝘛𝘦𝘳𝘪𝘮𝘢 𝘬𝘢𝘴𝘪𝘩 𝘋𝘦𝘷𝘦𝘯,\r\n" +
				"𝘶𝘯𝘵𝘶𝘬 𝘸𝘢𝘬𝘵𝘶\r\n" +
				"𝘶𝘯𝘵𝘶𝘬 𝘬𝘦𝘴𝘢𝘣𝘢𝘳𝘢𝘯\r\n" +
				"𝘶𝘯𝘵𝘶𝘬 𝘬𝘦𝘵𝘦𝘳𝘴𝘦𝘥𝘪𝘢𝘢𝘯\r\n" +
				"𝘶𝘯𝘵𝘶𝘬 𝘬𝘦𝘭𝘶𝘤𝘶𝘢𝘯\r\n" +
				"𝘶𝘯𝘵𝘶𝘬 𝘬𝘦𝘣𝘰𝘥𝘰𝘩𝘢𝘯\r\n" +
				"𝘶𝘯𝘵𝘶𝘬 𝘬𝘦𝘣𝘢𝘪𝘬𝘢𝘯\r\n" +
				"𝘶𝘯𝘵𝘶𝘬 𝘩𝘶𝘫𝘢𝘵𝘢𝘯\r\n" +
				"𝘶𝘯𝘵𝘶𝘬 𝘺𝘢𝘯𝘨 𝘬𝘦𝘮𝘢𝘳𝘦𝘯-𝘬𝘦𝘮𝘢𝘳𝘦𝘯 𝘸𝘬𝘸𝘬𝘸𝘬\n");
		System.out.println("𝙊𝙣𝙘𝙚 𝙖𝙜𝙖𝙞𝙣, 𝙃𝙖𝙥𝙥𝙮 𝘽𝙞𝙧𝙩𝙝𝙙𝙖𝙮 𝘿𝙚𝙫𝙚𝙣.\r\n" +
				"~ϝαɳყ\n\n");
	}

	public static void main(String[] args) {
		opening();
		dailyNotes();
		for(;;) {
			header();
			episode = in.nextInt();

			switch(episode) {
			case 1 :
				ceritaKu("1");
				ceritaKu("2");
				ceritaKu("3");
				ceritaKu("4");
				ceritaKu("5");
				ceritaKu("6");
				ceritaKu("7");
				ceritaKu("8");
				break;
			case 2 :
				ceritaKu("9");
				ceritaKu("10");
				ceritaKu("11");
				ceritaKu("12");
				ceritaKu("13");
				ceritaKu("14");
				ceritaKu("15");
				ceritaKu("16");
				break;
			case 3 :
				ceritaKu("17");
				ceritaKu("18");
				ceritaKu("19");
				ceritaKu("20");
				ceritaKu("21");
				ceritaKu("22");
				ceritaKu("23");
				ceritaKu("24");
				break;
			case 4 :
				ceritaKu("25");
				ceritaKu("26");
				ceritaKu("27");
				ceritaKu("28");
				ceritaKu("29");
				ceritaKu("30");
				ceritaKu("31");
				ceritaKu("32");
				break;
			case 5 :
				ceritaKu("33");
				ceritaKu("34");
				ceritaKu("35");
				ceritaKu("36");
				ceritaKu("37");
				ceritaKu("38");
				ceritaKu("39");
				ceritaKu("40");
				break;
			case 6 :
				ceritaKu("41");
				ceritaKu("42");
				ceritaKu("43");
				ceritaKu("44");
				ceritaKu("45");
				ceritaKu("46");
				ceritaKu("47");
				ceritaKu("48");
				break;
			case 7 :
				ceritaKu("49");
				break;
			default :
				closing();
				break;
			}
		}
	}
}
