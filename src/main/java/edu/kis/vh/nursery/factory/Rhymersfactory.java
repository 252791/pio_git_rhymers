package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public interface Rhymersfactory {
    
        public DefaultCountingOutRhymer GetStandardRhymer();
        
        public DefaultCountingOutRhymer GetFalseRhymer();
        
        public DefaultCountingOutRhymer GetFIFORhymer();
        
        public HanoiRhymer GetHanoiRhymer();
        
    }
