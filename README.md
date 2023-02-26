# Visualization_Dashboard

@RequestMapping("/api")

    //----------All Data--------------------
    @GetMapping("/api/data")
   
    //------------Filter by Endyear--------------------
    @GetMapping("/api/endyear/{endyear}")
 
    //-------------Filter By topic-------------------
    @GetMapping("/api/topic/{topic}")
   
    //------------Filter By Sector-------------------
    @GetMapping("/api/sector/{sector}")
 
    //------------Filter By pestle-------------------
    @GetMapping("/api/pestle/{pestle}")
   
    //------------Filter By source-------------------
    @GetMapping("/api/source/{source}")
   
    //------------Filter By swot-------------------
    @GetMapping("/api/swot/{swot}")
  
    //------------Filter By country-------------------
    @GetMapping("/api/country/{country}")
   
    //------------Filter By swot-------------------
    @GetMapping("/api/city/{city}")
   
    //------------Filter By Endyear and Sector-------------------
    @GetMapping("/endyear/{endyear}/sector/{sector}")
   
