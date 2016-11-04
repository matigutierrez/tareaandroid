angular.module('starter.services', [])

.factory('Chats', function() {
  // Might use a resource here that returns a JSON array

  // Some fake testing data
  var chats = [{
    id: 0,
    name: 'Matias',
    lastText: 'Choro',
    face: 'img/cara.png'
  }, {
    id: 1,
    name: 'Marcos',
    lastText: 'step',
    face: 'img/max.png'
  }, {
    id: 2,
    name: 'Adrian',
    lastText: 'Base',
    face: 'img/adam.jpg'
  }, {
    id: 3,
    name: 'Manteca',
    lastText: 'Drawable',
    face: 'img/cara.png'
  }, {
    id: 4,
    name: 'Felipe',
    lastText: 'Bellaco',
    face: 'img/mike.png'
  }];

  return {
    all: function() {
      return chats;
    },
    remove: function(chat) {
      chats.splice(chats.indexOf(chat), 1);
    },
    get: function(chatId) {
      for (var i = 0; i < chats.length; i++) {
        if (chats[i].id === parseInt(chatId)) {
          return chats[i];
        }
      }
      return null;
    }
  };
});
