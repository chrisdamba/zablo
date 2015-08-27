function findBranch() {
    $("#branch-map-canvas").mapsed({
    // Adds a predictive search box
    searchOptions: {
      enabled: false,
      //initSearch: "Football in Leeds",
      geoSearch: "bank near {POSITION}",
      placeholder: "Search ..."
    },
    
    // Turn on geo location button
    allowGeo: true,
    findGeoOnLoad: true,

    // allow user to select somewhere
    onSelect: function(m, details) {
      var msg = 
        "name: " + details.name +
        "<br/>street: " + details.street + ", " + 
          details.area + ", " + 
          details.town + ", " + details.postCode + 
        "<br/>telNo: " + details.telNo + 
        "<br/>website: " + details.website + 
        "<br/>g+: " + details.url
      ;
      m.showMsg("You selected ...", msg);
      // indicate tip should be closed
      return true;
    },
    
  });

}


function findAtm() {
    $("#atm-map-canvas").mapsed({
    // Adds a predictive search box
    searchOptions: {
      enabled: false,
      //initSearch: "Football in Leeds",
      geoSearch: "atm near {POSITION}",
      placeholder: "Search ..."
    },
    
    // Turn on geo location button
    allowGeo: true,
    findGeoOnLoad: true,

    // allow user to select somewhere
    onSelect: function(m, details) {
      var msg = 
        "name: " + details.name +
        "<br/>street: " + details.street + ", " + 
          details.area + ", " + 
          details.town + ", " + details.postCode + 
        "<br/>telNo: " + details.telNo + 
        "<br/>website: " + details.website + 
        "<br/>g+: " + details.url
      ;
      m.showMsg("You selected ...", msg);
      // indicate tip should be closed
      return true;
    },
    
  });

}

