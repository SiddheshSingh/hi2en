"""
    This script transliterates Hindi text to English script based on basic dictionary mappings.
"""


class hi2en:
    __vowels = {
        "अ": "a",
        "आ": "aa",
        "इ": "i",
        "ई": "ee",
        "उ": "u",
        "ऊ": "oo",
        "ऋ": "ru",
        "ए": "e",
        "ऐ": "ai",
        "ओ": "o",
        "औ": "au",
    }

    __consonants = {
        "क": "k",
        "ख": "kh",
        "ग": "g",
        "घ": "gh",
        "ङ": "ng",
        "च": "ch",
        "छ": "chh",
        "ज": "j",
        "झ": "jh",
        "ञ": "ny",
        "ट": "t",
        "ठ": "th",
        "ड": "d",
        "ढ": "dh",
        "ण": "nn",
        "त": "t",
        "थ": "th",
        "द": "d",
        "ध": "dh",
        "न": "n",
        "प": "p",
        "फ": "ph",
        "ब": "b",
        "भ": "bh",
        "म": "m",
        "य": "y",
        "र": "r",
        "ल": "l",
        "व": "v",
        "श": "sh",
        "ष": "sh",
        "स": "s",
        "ह": "h",
        "क्ष": "ksh",
        "त्र": "tr",
        "ज्ञ": "jny",
    }

    __modifiers = {
        "ा": "aa",
        "ि": "i",
        "ी": "ee",
        "ु": "u",
        "ू": "oo",
        "ृ": "ru",
        "े": "e",
        "ै": "ai",
        "ो": "o",
        "ौ": "au",
        "ं": "ng",
        "ः": "h",
        "्": "",
    }
    
    __fullstop = {
        "|": ".",
        "।": ".",
    }

    def transliterate(self, input):
        # Vowels
        for k, v in self.__vowels.items():
            input = input.replace(k, v)

        # Consonants
        for k, v in self.__consonants.items():
            input = input.replace(k, v)

        # Modifiers
        for k, v in self.__modifiers.items():
            input = input.replace(k, v)
            
        # Fullstop
        for k, v in self.__fullstop.items():
            input = input.replace(k, v)
        
        return input 
