package com.spql.graphql_starter.helper;


import com.spql.graphql_starter.models.NavratriDay;
import com.spql.graphql_starter.repositories.NavratriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class SeedData implements CommandLineRunner {
   @Autowired
   NavratriRepository navratriRepository;


    @Override
    public void run(String...args) throws Exception{


        List<NavratriDay> navratriDayList = navratriRepository.findAll();

        int[] days = {1,2,3,4,5,6,7,8,9};
        String[] goddess = {"SHAILAPUTRI","BRAHMACHARINI","CHANDRAGHANTA","KUSHMANDA","SKANDAMATA","KATYAYANI","KALARATRI","MAHAGAURI","SIDDHIDATRI"};
        String[] mantras = {"ॐ देवी शैलपुत्र्यै नमः","ॐ देवी ब्रह्मचारिण्यै नम:","ॐ देवी चंद्रघण्टायै नम:","ॐ ऐं ह्रीं क्लीं कूष्मांडायै नम:","ॐ देवी स्कन्दमातायै नम:","ॐ देवी कात्यायन्यै नम:","ॐ देवी कालरात्र्यै नम:","ॐ देवी महागौर्यै नम:","ॐ ऐं ह्रीं क्लीं सिद्धिदात्यै नम:"};
        String[] colors = {"yellow","green","grey","orange","white","red","royal blue","pink","purple"};
        String[] description = {
                "Mata Shailaputri is the daughter of the Mountain King Himavat, and is a manifestation and form of the Hindu mother goddess Mahadevi, as a form of goddess Parvati. She is the first Navadurga venerated during the first day of Navratri, and is a reincarnation of Goddess Sati.",
                "Mata Brahmacharini means a devoted female student who lives in an Ashrama with her Guru along with other students. She is the second aspect of the Navadurga forms of Mahadevi and is worshipped on the second day of Navaratri (the nine divine nights of Navadurga). The goddess Brahmacharini is an aspect of Parvati and wears white clothes, holding a japamala in her right hand and a kamandalu in her left.",
                "Mata Chandraghanta is the third navadurga aspect of goddess Mahadevi, worshipped on the third day of Navaratri (the nine divine nights of Navadurga). Her name Chandra-Ghanta, means \\\"one who has a half-moon shaped like a bell\\\". Her third eye is always open, signifying her perpetual readiness for battle against evil. She is also known as Chandrakhanda, Vrikahvahini or Chandrika. She is believed to reward people with her grace, bravery and courage. By her grace, all the sins, distresses, physical sufferings, mental tribulations and ghostly hurdles of the devotees are eradicated.",
                "Mata Kushmanda created the whole universe, which is called Brahmanda (ब्रह्माण्ड) in Sanskrit, by just flashing little bit of her smile. She also likes Bali of white pumpkin known as kushmanda (कुष्माण्ड). Due to her association with Brahmanda and Kushmanda, She is popularly known as Goddess Kushmanda. Her abode is in Anahata chakra. Her name signals her main role: Ku means \\\"a little\\\", Ushma means \\\"warmth\\\" or \\\"energy\\\" and Anda means \\\"cosmic egg\\\".",
                "Mata Skandamata quite literally translates to 'Mata' of 'Skanda'. 'Skanda' here refers to the God of War, Kartikeya. The legend goes, that a demon by the name of Tarakasura, could only be killed at the hands of Lord Shiva and Goddess Parvati's child. This is what beckoned the birth of Kartikeya.",
                "Mata Katyayani is an aspect of Mahadevi and the slayer of the tyrannical demon Mahishasura. She is the sixth among the Navadurgas, the nine forms of Hindu goddess Durga who are worshipped during the festival of Navaratri. She is depicted with four, ten or eighteen hands. This is the second name given to the goddess Adi Parashakti in Amarakosha, the Sanskrit (Goddess Parvati names- Uma, Katyayani, Gauri, Kali, Haimavati, Ishwari).",
                "Mata Kalratri is the seventh of the nine Navadurga forms of the goddess Mahadevi. She is first referenced in the Devi Mahatmya. Kalaratri is one of the fearsome forms of the goddess. This form of the goddess is believed to be the destroyer of all demon entities, ghosts, evil spirits and negative energies, who are said to flee upon knowing of her arrival. Kalaratri is also known as Shubankari (शुभंकरी), meaning auspicious/doing good in Sanskrit, due to the belief that she always provides positive results to her devotees. Hence, it is believed that she makes her devotees fearless.",
                "Mata Mahagauri is the eighth form among the Navadurga aspects of the Hindu mother goddess Mahadevi. She is worshipped on the eighth day of Navaratri. Mahagauri is believed to be able to fulfill all the desires of her devotees. Mahagauri is an icon of purity usually depicted in white while riding a white bull. She is depicted with four hands: she holds a trident in her right upper hand and in her left hand, she hold a damaru, and in the right hand Abhayamudra.She wears White sari with golden border.",
                "Mata Siddhidatri is the ninth and final among the Navadurga (nine forms) aspects of the Hindu mother goddess Mahadevi. The meaning of her name is as follows: Siddhi means supernatural power or meditative ability, and Dhatri means giver or awarder. She is worshipped on the ninth day of Navaratri (nine nights of Navadurga); she fulfills all the divine aspirations. It is believed that one side of Lord Shiva’s body is that of Goddess Siddhidatri. Therefore, he is also known by the name of Ardhanarishwara. According to Vedic scriptures, Lord Shiva attained all the siddhis by worshiping this Goddess."
        };
        if(navratriDayList.isEmpty()){

            for(int i = 0; i < 9; i++){
                NavratriDay day = NavratriDay.builder()
                        .day(days[i])
                        .goddess(goddess[i])
                        .mantra(mantras[i])
                        .description(description[i])
                        .color(colors[i])
                        .build();

                navratriRepository.save(day);
            }

        }
    }

}
