// BlogBridge -- RSS feed reader, manager, and web based service
// Copyright (C) 2002-2007 by R. Pito Salas
//
// This program is free software; you can redistribute it and/or modify it under
// the terms of the GNU General Public License as published by the Free Software Foundation;
// either version 2 of the License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
// without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
// See the GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License along with this program;
// if not, write to the Free Software Foundation, Inc., 59 Temple Place,
// Suite 330, Boston, MA 02111-1307 USA
//
// Contact: R. Pito Salas
// mailto:pitosalas@users.sourceforge.net
// More information: about BlogBridge
// http://www.blogbridge.com
// http://sourceforge.net/projects/blogbridge
//
// $Id: MostReadGuidesReport.java,v 1.4 2007/10/03 12:32:29 spyromus Exp $
//

package com.salas.bb.reports;

import com.salas.bb.persistence.domain.ReadStats;
import com.salas.bb.search.ResultItemType;
import com.salas.bb.utils.i18n.Strings;

import javax.swing.*;
import java.util.List;

/**
 * The report about the guides in which the user reads the most of articles.
 */
class MostReadGuidesReport extends AbstractMostReadPinnedReport
{
    /**
     * Creates a report.
     */
    public MostReadGuidesReport()
    {
        super(Strings.message("report.guide"), ResultItemType.GUIDE.getIcon());
    }

    /**
     * Returns the stats from the data provider.
     *
     * @param provider provider.
     *
     * @return stats.
     */
    protected List<ReadStats> getReadStats(IReportDataProvider provider)
    {
        return provider.statGetGuidesReadStats();
    }

    /**
     * Returns the name of the report.
     *
     * @return name.
     */
    public String getReportName()
    {
        return Strings.message("report.most.read.guides");
    }

    /**
     * Called to create a label component for an entity.
     *
     * @param id    entity ID.
     * @param title entity title.
     *
     * @return component.
     */
    protected JComponent createLabel(long id, String title)
    {
        return createGuideLabel(id, title);
    }
}
