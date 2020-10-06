export default{
    URL: 'https://michinai.cf/api',
    ROUTES:{
        login: '/user/login',

        conversation: '/conv/:selectedDate',

        //Word
        getWordbook: '/wordbook/', // 뒤에 유저 id
        getBaseWordbook : '/wordbook/base',
        addWordbook: '/wordbook',
        addWord: '/wordbook/word'
    }
}
