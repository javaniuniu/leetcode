class Solution(object):
    def isPrefixOfWord(self, sentence, searchWord):
        """
        :type sentence: str
        :type searchWord: str
        :rtype: int
        """
        sentence = sentence.split()
        for i ,sent in enumerate(sentence):
            flag = True
            for j in zip(sent,searchWord):
                if len(set(j)) == 1:
                    continue
                else:
                    flag = False
                    break
            if flag:
                return i+1
            
        return -1
sentence ="i love eating burger"
searchWord = "burg"
Solution().isPrefixOfWord(sentence,searchWord)